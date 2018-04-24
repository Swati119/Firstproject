package com.framework.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	private static Sheet sheet = null;
	private static Workbook workbook = null;

	public static Workbook setExcel(String excelFilePath) {
		try {
			FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
			workbook = getWorkbook(inputStream, excelFilePath);

		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return workbook;
	}

	public static void closeExcel() {
		try {
			workbook.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Workbook getWorkbook(FileInputStream inputStream, String excelFilePath) throws IOException {
		Workbook workBook = null;
		if (excelFilePath.endsWith("xlsx")) {
			workBook = new XSSFWorkbook(inputStream);
		} else if (excelFilePath.endsWith("xls")) {
			workBook = new HSSFWorkbook(inputStream);
		} else {
			throw new IllegalArgumentException("The specified file is not Excel file");
		}
		return workBook;
	}

	@SuppressWarnings("deprecation")
	public static HashMap<String, List<String>> getData(String sheetName) {
		sheet = workbook.getSheet(sheetName);
		int masterSheetColumnIndex = sheet.getRow(0).getPhysicalNumberOfCells();
		List<String> ExpectedColumns = new ArrayList<String>();
		Row row = sheet.getRow(0);
		for (int x = 0; x < masterSheetColumnIndex; x++) {
			Cell cell = row.getCell(x);
			if (cell != null) {
				String value = cell.getStringCellValue();
				ExpectedColumns.add(value);
			}
		}
		HashMap<String, List<String>> columnDataValues = new HashMap<String, List<String>>();
		int rowNumber = sheet.getPhysicalNumberOfRows();
		List<String> column1 = new ArrayList<String>();
		// read values from driver sheet for each column
		for (int j = 0; j < masterSheetColumnIndex; j++) {
			column1 = new ArrayList<String>();
			for (int i = 1; i < rowNumber; i++) {
				Row row1 = sheet.getRow(i);
				Cell cell = row1.getCell(j);
				if (cell != null) {
					cell.setCellType(Cell.CELL_TYPE_STRING);
					column1.add(cell.getStringCellValue().toString());
				}
			}
			columnDataValues.put(ExpectedColumns.get(j), column1);
		}
		return columnDataValues;

	}

	public static List<String> getDataList(String sheetName, String columnName) {
		List<String> values = null;
		try {
			HashMap<String, List<String>> columnDataValues = getData(sheetName);
			for (Entry<String, List<String>> entry : columnDataValues.entrySet()) {

				if ((entry.getKey().toString()).equals(columnName)) {
					values = entry.getValue();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return values;
	}

	@SuppressWarnings("deprecation")
	public static String[][] getFeatureFiles(String filePath, String sheetName) {
		String[][] dataList = null;
		Workbook workbook = setExcel(filePath);
		Sheet sheet = workbook.getSheet(sheetName);

		int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells();
		int totalRows = sheet.getPhysicalNumberOfRows();
		
		int rowCount =0;
		int startRow = 1;

		int startCol = 0;

		for (int i = 0; i < totalRows; i++) {
			Row row = sheet.getRow(i);
			if(row!=null){
				rowCount = rowCount +1;
			}
		}
		
		int ci, cj;

		ci = 0;
		dataList = new String[rowCount - 1][totalColumns];
		for (int i = startRow; i < rowCount; i++, ci++) {

			cj = 0;

			for (int j = startCol; j < totalColumns; j++, cj++) {
				Row row = sheet.getRow(i);

				// Cell cell = sheet.getRow(i).getCell(j);
				if (row != null) {
					Cell cell = row.getCell(j);
					if (cell != null) {
						cell.setCellType(Cell.CELL_TYPE_STRING);
						dataList[ci][cj] = cell.getStringCellValue();
					}
				}

			}

		}

		String[][] featureList = new String[rowCount - 1][totalColumns];
		for (int i = 0; i < dataList.length; i++) {
			for (int j = 0; j < totalColumns; j++) {
				featureList[i][j] = dataList[i][j];
			}

		}

		return featureList;

	}

	@SuppressWarnings("deprecation")
	public static String[][] getValues(String sheetName) {
		String[][] dataList = null;
		Sheet sheet = workbook.getSheet(sheetName);

		int totalColumns = sheet.getRow(0).getPhysicalNumberOfCells();
		int totalRows = sheet.getPhysicalNumberOfRows();
		dataList = new String[totalRows - 1][totalColumns];
		int startRow = 1;

		int startCol = 0;

		int ci, cj;

		ci = 0;

		for (int i = startRow; i < totalRows; i++, ci++) {

			cj = 0;

			for (int j = startCol; j < totalColumns; j++, cj++) {
				Cell cell = sheet.getRow(i).getCell(j);
				if (cell != null) {
					cell.setCellType(Cell.CELL_TYPE_STRING);
					dataList[ci][cj] = cell.getStringCellValue();
				}

			}

		}

		String[][] featureList = new String[totalRows - 1][totalColumns];
		for (int i = 0; i < dataList.length; i++) {
			for (int j = 0; j < totalColumns; j++) {
				featureList[i][j] = dataList[i][j];
			}
			/*
			 * featureList[i][0] = dataList[i][0]; featureList[i][1] =
			 * dataList[i][1]; featureList[i][2] = dataList[i][2];
			 * featureList[i][3] = dataList[i][3];
			 */

		}

		return featureList;

	}

	@SuppressWarnings("deprecation")
	public static HashMap<String, List<String>> getData(Sheet sheet) {
		int masterSheetColumnIndex = sheet.getRow(0).getPhysicalNumberOfCells();
		List<String> ExpectedColumns = new ArrayList<String>();
		Row row = sheet.getRow(0);
		for (int x = 0; x < masterSheetColumnIndex; x++) {
			Cell cell = row.getCell(x);
			String value = cell.getStringCellValue();
			ExpectedColumns.add(value);
		}
		HashMap<String, List<String>> columnDataValues = new HashMap<String, List<String>>();

		List<String> column1 = new ArrayList<String>();
		// read values from driver sheet for each column
		for (int j = 0; j < masterSheetColumnIndex; j++) {
			column1 = new ArrayList<String>();
			for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
				Row row1 = sheet.getRow(i);
				Cell cell = row1.getCell(j);
				cell.setCellType(Cell.CELL_TYPE_STRING);
				/*
				 * String value = null; try { value =
				 * cell.getStringCellValue().toString(); } catch (Exception e) {
				 * value = null; }
				 */
				if (cell != null) {
					column1.add(cell.getStringCellValue().toString());
				}
			}
			columnDataValues.put(ExpectedColumns.get(j), column1);
		}
		return columnDataValues;

	}

	public static String getDataByColumnName(String sheetName, String columnName) {
		String cellData = null;
		try {
			HashMap<String, List<String>> columnDataValues = getData(sheetName);
			for (Entry<String, List<String>> entry : columnDataValues.entrySet()) {
				List<String> values = entry.getValue();
				if (entry.getKey().equals(columnName)) {
					cellData = values.get(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cellData;
	}

	public static String getDataByColumnNameWithRowIndex(String sheetName, String columnName, int rowIndex) {
		String cellData = null;
		try {
			HashMap<String, List<String>> columnDataValues = getData(sheetName);
			for (Entry<String, List<String>> entry : columnDataValues.entrySet()) {
				List<String> values = entry.getValue();
				if (entry.getKey().equals(columnName)) {
					cellData = values.get(rowIndex - 2);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return cellData;

	}

	public static void createExcelFile(String filePath) {

		workbook = new XSSFWorkbook();
		XSSFSheet sheet = (XSSFSheet) workbook.createSheet("Results");
		String[] resultsColumn = { "Testcase Name", "Description", "Input Data", "Output Data", "Status" };

		int rowCount = 0;
		Row row = sheet.createRow(rowCount);
		int columnCount = 0;
		for (String header : resultsColumn) {
			Cell cell = row.createCell(columnCount++);
			cell.setCellValue(header);
		}

		try {
			FileOutputStream outputStream = new FileOutputStream(filePath);
			workbook.write(outputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeTestResults(String filePath, String testCaseName, String description, String inputData,
			String outputData, String status) {
		setExcel(filePath);
		sheet = workbook.getSheet("Results");
		int rowNumbers = sheet.getPhysicalNumberOfRows();
		Row row = sheet.createRow(rowNumbers);
		int columnCount = 0;
		Cell cell = row.createCell(columnCount++);
		cell.setCellValue(testCaseName);
		cell = row.createCell(columnCount++);
		cell.setCellValue(description);
		cell = row.createCell(columnCount++);
		cell.setCellValue(inputData);
		cell = row.createCell(columnCount++);
		cell.setCellValue(outputData);
		cell = row.createCell(columnCount);
		cell.setCellValue(status);
		try {
			FileOutputStream outputStream = new FileOutputStream(filePath);
			workbook.write(outputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void createQuoteExcelFile(String filePath) {

		workbook = new XSSFWorkbook();
		XSSFSheet sheet = (XSSFSheet) workbook.createSheet("QuoteIDs");
		String[] resultsColumn = { "MethodName", "QuoteID" };

		int rowCount = 0;
		Row row = sheet.createRow(rowCount);
		int columnCount = 0;
		for (String header : resultsColumn) {
			Cell cell = row.createCell(columnCount++);
			cell.setCellValue(header);
		}

		try {
			FileOutputStream outputStream = new FileOutputStream(filePath);
			workbook.write(outputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void writeQuoteIDs(String filePath, String methodName, String quoteID) {
		setExcel(filePath);
		sheet = workbook.getSheet("QuoteIDs");
		int rowNumbers = sheet.getPhysicalNumberOfRows();
		Row row = sheet.createRow(rowNumbers);
		int columnCount = 0;
		Cell cell = row.createCell(columnCount++);
		cell.setCellValue(methodName);
		cell = row.createCell(columnCount++);
		cell.setCellValue(quoteID);
		try {
			FileOutputStream outputStream = new FileOutputStream(filePath);
			workbook.write(outputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void writeData(String filePath, String methodName, String quoteID) {
		setExcel(filePath);
		sheet = workbook.getSheet("OutputData");
		int rowNumbers = sheet.getPhysicalNumberOfRows();
		Row row = sheet.createRow(rowNumbers);
		int columnCount = 0;
		Cell cell = row.createCell(columnCount++);
		cell.setCellValue(methodName);
		cell = row.createCell(columnCount++);
		cell.setCellValue(quoteID);
		try {
			FileOutputStream outputStream = new FileOutputStream(filePath);
			workbook.write(outputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
