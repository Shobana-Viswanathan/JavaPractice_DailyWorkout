package com.utilities;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class Data_Provider {

    @DataProvider(name = "RegisterData")
    public Object[][] registerData() throws Exception {
        return getExcelData("src\\test\\resources\\Book1.xlsx", "Sheet1");
    }
    @DataProvider(name = "ExistingUser")
    public Object[][] existingUserData() throws Exception {
        return getExcelData("src\\test\\resources\\Book1.xlsx", "Sheet1");
    }

    @DataProvider(name = "ValidLogin")
    public Object[][] validLoginData() throws Exception {
        return getExcelData("src\\test\\resources\\Book1.xlsx", "Sheet3");
    }

    @DataProvider(name = "InvalidLogin")
    public Object[][] invalidLoginData() throws Exception {
        return getExcelData("src\\test\\resources\\Book1.xlsx", "Sheet4");
    }

    public Object[][] getExcelData(String fileName, String sheetName) {

        String[][] data = null;

        try {
            FileInputStream fis = new FileInputStream(fileName);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet(sheetName);

            int rows = sheet.getPhysicalNumberOfRows();
            int cols = sheet.getRow(0).getLastCellNum();

            DataFormatter formatter = new DataFormatter();

            data = new String[rows - 1][cols];
            int count = 0;

            for (int i = 1; i < rows; i++) {

                XSSFRow row = sheet.getRow(i);
                if (row == null) continue;

                boolean isEmpty = true;

                for (int j = 0; j < cols; j++) {
                    Cell cell = row.getCell(j);
                    String value = formatter.formatCellValue(cell);

                    if (!value.trim().isEmpty()) {
                        isEmpty = false;
                        break;
                    }
                }

                if (isEmpty) continue;

                for (int j = 0; j < cols; j++) {
                    Cell cell = row.getCell(j);
                    data[count][j] = formatter.formatCellValue(cell);
                }

                count++;
            }

            String[][] finalData = new String[count][cols];
            for (int i = 0; i < count; i++) {
                finalData[i] = data[i];
            }

            workbook.close();
            fis.close();

            return finalData;

        } catch (Exception e) {
            System.out.println("Excel Error: " + e.getMessage());
        }

        return data;
    }
}