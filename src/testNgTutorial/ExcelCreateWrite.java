package testNgTutorial;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelCreateWrite {
    public static void main(String[] args) throws IOException {
        // FileInputStream fis = new FileInputStream("E:\\QE Automation\\UdemyData1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet0 = workbook.createSheet("firstSheet");
        Row row0 = sheet0.createRow(0);
        Cell cellA = row0.createCell(0);
        Cell cellB = row0.createCell(1);
        cellA.setCellValue("first cell");
        cellB.setCellValue("second cell");

        File f = new File("E:\\QE Automation\\ExcelData\\myExcelFile1.xlsx");
        FileOutputStream fo = new FileOutputStream(f);
        workbook.write(fo);

        workbook.close();
        System.out.println("My file Created");

    }

    @Test
    public void testxx() {
        ExcelReader excelReader;
        excelReader = new ExcelReader("E:\\QE Automation\\ExcelData\\myExcelFile1.xlsx");
        System.out.println(excelReader.isSheetExist("firstSheet"));


    }

    @Test
    public void testxx1() {
        ExcelReader excelReader;
        excelReader = new ExcelReader("E:\\QE Automation\\ExcelData\\myExcelFile1.xlsx");
        excelReader.addSheet("Kamal");

    }

    @Test
    public void testxx2() {
        ExcelReader excelReader;
        excelReader = new ExcelReader("E:\\QE Automation\\UdemyData1.xlsx");
        System.out.println(excelReader.getCellRowNum("UdemyData1", "Purchase", "Adidas"));
    }

    @Test
    public void testxx3() {
       // ExcelReader excelReader;

        //excelReader = new ExcelReader("E:\\QE Automation\\UdemyData1.xlsx");
        ExcelReader reader = new ExcelReader("E:\\QE Automation\\ExcelData\\Login.xlsx");
        String sheetName = "Sheet2";
     //   System.out.println("pass1");

        int rowCount = reader.getRowCount(sheetName);
       // System.out.println(rowCount);

        for (int rowNum = 2; rowNum <= rowCount; rowNum++) {
            String loginId = reader.getCellData(sheetName,"TestCases",rowNum);
            System.out.println(loginId);
            String data = reader.getCellData(sheetName, "data1", rowNum);
            System.out.println(data);
         //   String dataVa= reader.getCellData(sheetName,"data2",rowNum);
         //   System.out.println(dataVa);
          //  String dataMD = reader.getCellData(sheetName,"data3",rowNum);
         //  System.out.println(dataMD);
           // System.out.println(loginId);
          //  System.out.println(loginId + " " + password);
           // System.out.println("pass5");


//            userName.clear();
//            userName.sendKeys(loginId);
//
//            pwd.clear();
//            pwd.sendKeys(passsword);


            //System.out.println(excelReader.getCellData("testdata",1,4));
            // int rowCount=excelReader.getCellRowNum("testdata","TestCases","Kimo");
            // System.out.println(rowCount);
//         testDataMap = excelReader.getCellData());
//        for (Entry map : excelReader.getCellData())


        }
    }
}