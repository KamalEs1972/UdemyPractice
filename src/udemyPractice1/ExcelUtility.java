package udemyPractice1;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ExcelUtility {
    //static ExcelUtility excelUtility;

    public static Map<String, String> getMapData() throws FileNotFoundException {
       // excelUtility = new ExcelUtility();

        Map<String, String> testData = new HashMap<String, String>();

        try {
            FileInputStream fis = new FileInputStream("E:\\QE Automation\\UdemyData1.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(fis);

            Sheet sheet = workbook.getSheetAt(1);
            int lastRowNumber = workbook.getNumberOfSheets();
            for (int i = 0; i <= lastRowNumber; i++) {
                Row row = sheet.getRow(i);
                Cell keyCell = row.getCell(i);
                String key = keyCell.getStringCellValue().trim();
                Cell valueCell = row.getCell(1);
                String value = valueCell.getStringCellValue().trim();
                testData.put(key, value);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        return testData;
    }
}