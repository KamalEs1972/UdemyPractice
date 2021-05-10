package udemyPractice1;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.Map;

public class ExcelRead1 {
   // ExcelUtility excelUtility;
@Test
    public  void test1() {
      //  excelUtility = new ExcelUtility();
        try{
        Map<String, String> testData = ExcelUtility.getMapData();
        for (Map.Entry<String, String> map : testData.entrySet()) {


            System.out.println("Key= " + map.getKey() + "Value=  " + map.getValue());
        }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}


