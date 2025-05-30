package utilities;

import org.apache.poi.ss.usermodel.*;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public Sheet sheet;

    public ExcelReader() {
        String excelPath = ConfigReader.getProperty("excelPath");
        String sheetName = ConfigReader.getProperty("sheetName");
        try {
            FileInputStream file = new FileInputStream(excelPath);
            Workbook workbook = WorkbookFactory.create(file);
            sheet = workbook.getSheet(sheetName);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Could not read Excel file.");
        }
    }

    public String getCellData(int rowNum, int colNum) {
        Row row = sheet.getRow(rowNum);
        if (row == null)
            return "";
        Cell cell = row.getCell(colNum);
        if (cell == null)
            return "";
        return cell.toString();
    }

//    public int getRowCount() {
//        return sheet.getLastRowNum();
//    }
}
