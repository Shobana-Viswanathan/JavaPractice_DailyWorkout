package com.utilities;

import org.testng.annotations.DataProvider;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DPExcel {

    @DataProvider(name="ValidexcelData", parallel = true)
    public Object[][] ValidexcelDataProvider() throws IOException {
        Object[][] arrObj = getExcelData("src\\test\\resources\\data.xlsx","Sheet1");
        return new Object[][] { arrObj[0] };
    }

    @DataProvider(name="InValidexcelData", parallel = true)
    public Object[][] InvalidexcelDataProvider() throws IOException {
        Object[][] arrObj = getExcelData("src\\test\\resources\\data.xlsx","Sheet1");
        return new Object[][] { arrObj[1], arrObj[2] };
    }

    private String[][] getExcelData(String fileName, String sheetName) {

        String[][] data = null;

        try {
            FileInputStream fis = new FileInputStream(fileName);
            XSSFWorkbook workBook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workBook.getSheet(sheetName);

            XSSFRow row = sheet.getRow(0);
            int noOfRows = sheet.getPhysicalNumberOfRows();
            int noOfCol = row.getLastCellNum();

            data = new String[noOfRows - 1][noOfCol];

            Cell cell;

            for (int i = 1; i < noOfRows; i++) {
                for (int j = 0; j < noOfCol; j++) {
                    row = sheet.getRow(i);   
                    cell = row.getCell(j);
                    data[i - 1][j] = cell.getStringCellValue();
                }
            }

            workBook.close();
            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        return data;
    }
}