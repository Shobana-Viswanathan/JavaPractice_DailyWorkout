package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {

    @DataProvider(name="ValidData", parallel = true)
    public Object[][] ValidexcelDataProvider() throws IOException {
        Object[][] arrObj = getExcelData("src\\test\\resources\\datahrm.xlsx", "Sheet1");
        return arrObj; 
    }

    @DataProvider(name="InValidData", parallel = true)
    public Object[][] InvalidexcelDataProvider() throws IOException {
        Object[][] arrObj = getExcelData("src\\test\\resources\\datahrm.xlsx", "Sheet2");
        return arrObj;
    }

    private String[][] getExcelData(String FileName, String SheetName) {

        String[][] data = null;

        try {
            FileInputStream fis = new FileInputStream(FileName);
            XSSFWorkbook workBook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workBook.getSheet(SheetName);

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
