package testNgTutorial;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteDateIntoExcel {

@Test
    public void writeData () throws IOException {

        FileInputStream fis = new FileInputStream("E:\\QE Automation\\UdemyData1.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet0 = workbook.getSheetAt(0);

       sheet0.getRow(1).createCell(4).setCellValue("Pass");
       sheet0.getRow(2).createCell(4).setCellValue("Fail");
        FileOutputStream fos=new FileOutputStream("E:\\QE Automation\\UdemyData1.xlsx");
        workbook.write(fos);

        workbook.close();


    }
//@Test
//    public void enterData() throws IOException {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter Result");
//        String name = sc.next();
//            WriteDateIntoExcel writeDateIntoExcel = new WriteDateIntoExcel();
//            writeDateIntoExcel.writeData(name);
//
//
//    }

}
