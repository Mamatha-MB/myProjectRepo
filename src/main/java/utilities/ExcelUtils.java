package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	public static XSSFWorkbook workbook;
	public static XSSFSheet sheet;
	public static XSSFRow row;
	public static XSSFCell cell;

	public ExcelUtils(String filePath, String sheetName) {

		try {
			FileInputStream fis = new FileInputStream(filePath);
			workbook = new XSSFWorkbook(fis);
			sheet = workbook.getSheet(sheetName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Object[][] readExcel() throws Exception {
		System.out.println("Inside readExcel");
		String[][] cellDataObj = null;
		int startRow = 0;
		int startCol = 0;
		int ci, cj;
		int totalRows = getRowNum();
		int totalCols = getColumnNum();
		cellDataObj = new String[totalRows][totalCols];
		ci = 0;
		for (int i = startRow; i < totalRows; i++, ci++) {
			cj = 0;
			for (int j = startCol; j < totalCols; j++, cj++) {
				cellDataObj[ci][cj] = getCellData(i, j);
				System.out.println(cellDataObj[ci][cj]);
			}
		}
		return (cellDataObj);

	}

	public String getCellData(int rowNum, int colNum) {
		cell = sheet.getRow(rowNum).getCell(colNum);
		String cellData = cell.getStringCellValue();
		return cellData;
	}

	public int getRowNum() {
		return (sheet.getLastRowNum() + 1);
	}

	public int getColumnNum() {
		row=sheet.getRow(0);
		return row.getLastCellNum();
	}

}
