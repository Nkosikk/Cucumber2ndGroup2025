package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {

    public static String[] readOrderData(String filePath, String sheetName) {
        String[] data = new String[6]; // Assuming 6 columns of data
        FileInputStream fis = null;
        Workbook workbook = null;

        try {
            fis = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(fis);

            // Debug: Print all sheet names
            System.out.println("Available sheets:");
            for (int i = 0; i < workbook.getNumberOfSheets(); i++) {
                System.out.println("- " + workbook.getSheetName(i));
            }

            Sheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                throw new RuntimeException("❌ Sheet '" + sheetName + "' not found in: " + filePath);
            }

            // Read second row (index 1)
            Row row = sheet.getRow(1);
            if (row == null) {
                throw new RuntimeException("❌ No data found in row 2 of sheet: " + sheetName);
            }

            for (int i = 0; i < 6; i++) {
                Cell cell = row.getCell(i);
                data[i] = (cell != null) ? cell.toString() : "";
            }

        } catch (IOException e) {
            System.err.println("⚠️ Error reading Excel file: " + e.getMessage());
        } finally {
            try {
                if (workbook != null) workbook.close();
                if (fis != null) fis.close();
            } catch (IOException e) {
                System.err.println("⚠️ Failed to close file: " + e.getMessage());
            }
        }

        return data;
    }
}
