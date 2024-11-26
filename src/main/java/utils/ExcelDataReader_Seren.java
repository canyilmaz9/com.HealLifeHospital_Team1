package utils;
import config.ConfigReader;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataReader_Seren {

	private Workbook workbook;
	private Sheet sheet;

	public ExcelDataReader_Seren(String filePath, String sheetName) {
		try {
			FileInputStream fis = new FileInputStream(new File(filePath));
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getCellData(int rowNum, int colNum) {
		Row row = sheet.getRow(rowNum);
		if (row == null) return ""; // Eğer satır boşsa
		Cell cell = row.getCell(colNum);
		if (cell == null) return ""; // Eğer hücre boşsa

		switch (cell.getCellType()) {
			case STRING:
				return cell.getStringCellValue();
			case NUMERIC:
				if (DateUtil.isCellDateFormatted(cell)) {
					return cell.getDateCellValue().toString(); // Tarih formatı
				}
				return String.valueOf(cell.getNumericCellValue());
			case BOOLEAN:
				return String.valueOf(cell.getBooleanCellValue());
			case FORMULA:
				return cell.getCellFormula(); // Formül içeren hücre
			case BLANK:
				return ""; // Boş hücre
			default:
				return "Invalid Cell Type";
		}
	}

	public int getRowCount() {
		return sheet.getLastRowNum() + 1; // Toplam satır sayısı
	}

	public int getColumnCount(int rowNum) {
		Row row = sheet.getRow(rowNum);
		if (row == null) return 0; // Eğer satır boşsa
		return row.getLastCellNum(); // Sütun sayısı
	}

	public static Workbook getWorkbook() {
		Workbook workbook = null;
		try {
			// ConfigReader'dan Excel dosyasının yolunu al
			String excelFilePath = ConfigReader.getProperty("testData");

			// Excel dosyasını yükle
			FileInputStream fis = new FileInputStream(excelFilePath);
			workbook = new XSSFWorkbook(fis);
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Excel file could not be loaded!");
		}
		return workbook;
	}
	public static int getSheetPageNumber(String sheetName) {
		Workbook workbook = getWorkbook();

		// Sheet'in indexini al
		int sheetIndex = workbook.getSheetIndex(sheetName);

		// Eğer sheet bulunamazsa -1 döndür
		if (sheetIndex == -1) {
			System.out.println("Sheet '" + sheetName + "' bulunamadı.");
			return -1;
		}

		// 1-indexed sayfa numarasını döndür
		return sheetIndex + 1;
	}


}

