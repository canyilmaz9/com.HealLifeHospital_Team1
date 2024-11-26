package utils;

import config.ConfigReader;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelCreator_seren {

   // yeni excelFile olusturur
    public static void createExcel(String fileName, Map<String, List<Object[]>> sheetsData) {
        Workbook workbook = new XSSFWorkbook();

        try {
            // Map içindeki her bir sheet için işlem yap
            for (Map.Entry<String, List<Object[]>> entry : sheetsData.entrySet()) {
                String sheetName = entry.getKey();
                List<Object[]> sheetData = entry.getValue();

                // Yeni sheet oluştur
                Sheet sheet = workbook.createSheet(sheetName);

                // Sheet'i doldur
                populateSheet(sheet, sheetData);
            }

            // Excel dosyasını kaydet
            try (FileOutputStream fos = new FileOutputStream(fileName)) {
                workbook.write(fos);
                System.out.println("Excel dosyası başarıyla oluşturuldu: " + fileName);
            }
        } catch (IOException e) {
            System.err.println("Excel dosyası oluşturulurken hata meydana geldi: " + e.getMessage());
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                System.err.println("Workbook kapatılırken hata meydana geldi: " + e.getMessage());
            }
        }
    }


    /**
     * Bir sheet'e verilen verileri yazar.

     */
    private static void populateSheet(Sheet sheet, List<Object[]> sheetData) {
        int rowCount = 0;

        for (Object[] rowData : sheetData) {
            Row row = sheet.createRow(rowCount++);
            int columnCount = 0;

            for (Object field : rowData) {
                Cell cell = row.createCell(columnCount++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                } else if (field instanceof Double) {
                    cell.setCellValue((Double) field);
                }
            }
        }

        // Kolon genişliklerini otomatik ayarla
        for (int i = 0; i < sheetData.get(0).length; i++) {
            sheet.autoSizeColumn(i);
        }
    }

// var olan excel File a page ekler
    public static void addSheetToExistingExcel(String fileName, String sheetName, List<Object[]> sheetData) {
        Workbook workbook;

        try (FileInputStream fis = new FileInputStream(fileName)) {
            // Mevcut Excel dosyasını yükle
            workbook = new XSSFWorkbook(fis);

            // Yeni sheet oluştur
            Sheet sheet = workbook.createSheet(sheetName);

            // Sheet'i doldur
            populateSheet(sheet, sheetData);

            // Dosyayı kaydet
            try (FileOutputStream fos = new FileOutputStream(fileName)) {
                workbook.write(fos);
                System.out.println("Yeni sheet başarıyla eklendi: " + sheetName);
            }

        } catch (IOException e) {
            System.err.println("Excel dosyası güncellenirken hata oluştu: " + e.getMessage());
        }
    }



    public static Object[][] provideExcelData() {
        return new Object[][]{
                {"Date", "Medicine Name", "Dose1", "Dose2"}, // Başlık satırı
                {"20.11.2024 (Wednesday)", "AMOXIL", "Time: 07:00 AM 1 Hour", "Time: 12:00 PM 1 Hour","+"} // Veri satırı
        };
    }

    public static void createStaticExcel(String fileName, String sheetName) {
        Workbook workbook = new XSSFWorkbook();

        try {
            // Yeni bir sheet oluştur
            Sheet sheet = workbook.createSheet(sheetName);

            // **Koyu yazı stili oluştur**
            CellStyle boldStyle = workbook.createCellStyle();
            Font boldFont = workbook.createFont();
            boldFont.setBold(true); // Koyu yazı fontu
            boldStyle.setFont(boldFont);

            // **Kenarlık stili oluştur**
            CellStyle borderStyle = workbook.createCellStyle();
            borderStyle.setBorderTop(BorderStyle.THIN);
            borderStyle.setBorderBottom(BorderStyle.THIN);
            borderStyle.setBorderLeft(BorderStyle.THIN);
            borderStyle.setBorderRight(BorderStyle.THIN);



            // Başlık satırını oluştur
            Row headerRow = sheet.createRow(0);
            for (int colNum = 1; colNum <= 30; colNum++) {
                Cell cell = headerRow.createCell(colNum );
                cell.setCellValue(colNum + ".column");
                cell.setCellStyle(boldStyle); // Başlık hücresine koyu stil uygula
                cell.setCellStyle(borderStyle); // Çerçeve ekle
            }

            // Satırları oluştur ve sütunları doldur
            for (int rowNum = 1; rowNum <= 30; rowNum++) {
                Row row = sheet.createRow(rowNum);
                Cell firstCell = row.createCell(0); // İlk sütuna "row" bilgisi yaz
                firstCell.setCellValue(rowNum + ".row");
                firstCell.setCellStyle(boldStyle); // İlk sütunu koyu yaz


                for (int colNum = 1; colNum < 30; colNum++) {
                    Cell cell = row.createCell(colNum);
                    cell.setCellValue(""); // Hücreleri boş bırak
                    cell.setCellStyle(borderStyle); // Çerçeve ekle
                }
            }

            // Dosyayı kaydet
            try (FileOutputStream fos = new FileOutputStream(fileName)) {
                workbook.write(fos);
                System.out.println("Excel dosyası başarıyla oluşturuldu: " + fileName);
            }

        } catch (IOException e) {
            System.err.println("Excel dosyası oluşturulurken hata meydana geldi: " + e.getMessage());
        } finally {
            try {
                workbook.close();
            } catch (IOException e) {
                System.err.println("Workbook kapatılırken hata meydana geldi: " + e.getMessage());
            }
        }
    }


    public static void writeToCellsByPosition(String excelFilePath, String sheetName, Object[][] data, int startRow, int startColumn) throws IOException {
        Workbook workbook;
        Sheet sheet;

        // Mevcut Excel dosyasını aç veya yoksa yeni oluştur
        try (FileInputStream fis = new FileInputStream(excelFilePath)) {
            workbook = new XSSFWorkbook(fis); // Var olan dosyayı aç
            sheet = workbook.getSheet(sheetName);
            if (sheet == null) { // Sayfa yoksa oluştur
                sheet = workbook.createSheet(sheetName);
            }
        } catch (IOException e) {
            workbook = new XSSFWorkbook(); // Yeni workbook oluştur
            sheet = workbook.createSheet(sheetName);
        }

        // Verileri yaz
        for (int rowIndex = 0; rowIndex < data.length; rowIndex++) {
            // Satırı al veya oluştur
            Row row = sheet.getRow(startRow + rowIndex);
            if (row == null) {
                row = sheet.createRow(startRow + rowIndex);
            }

            for (int colIndex = 0; colIndex < data[rowIndex].length; colIndex++) {
                // Hücreyi al veya oluştur
                Cell cell = row.getCell(startColumn + colIndex);
                if (cell == null) {
                    cell = row.createCell(startColumn + colIndex);
                }

                // Hücre değerlerini yaz
                Object cellValue = data[rowIndex][colIndex];
                if (cellValue instanceof String) {
                    cell.setCellValue((String) cellValue);
                } else if (cellValue instanceof Number) {
                    cell.setCellValue(((Number) cellValue).doubleValue());
                } else if (cellValue == null) {
                    cell.setCellValue(""); // Null değerler için boş yaz
                } else {
                    cell.setCellValue(cellValue.toString()); // Diğer durumlar için toString() kullan
                }
            }
        }

        // Excel dosyasını kaydet
        try (FileOutputStream fos = new FileOutputStream(excelFilePath)) {
            workbook.write(fos);
        } finally {
            workbook.close();
        }

        System.out.println("Veriler başarıyla yazıldı: " + excelFilePath);
    }




    public static void main(String[] args) throws IOException {


/*
        List<Object[]> sheetData = List.of(
                new Object[]{"Date", "Medicine Name", "Dose1", "Dose2"},
                new Object[]{"17.11.2024 (Sunday)", "Alprovit", "Time: 12:00 PM\n1 (ML)", "Time: 08:00 AM\n1 (ML)"}
        );

        addSheetToExistingExcel(ConfigReader.getProperty("testData"),"serenMedicineList",sheetData);
*/
      //  createStaticExcel(ConfigReader.getProperty("testData2"),"deneme");

        Object[][] excelData =  provideExcelData();

        writeToCellsByPosition(ConfigReader.getProperty("testData2"),"deneme", excelData,1,1);




    }




}