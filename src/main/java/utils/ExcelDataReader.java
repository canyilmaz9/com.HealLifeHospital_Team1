package utils;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelDataReader {

	private Workbook workbook;
	private Sheet sheet;

	public ExcelDataReader(String filePath, String sheetName) {
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
}

