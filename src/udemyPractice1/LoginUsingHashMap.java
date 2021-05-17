package udemyPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class LoginUsingHashMap {

    static HashMap<String,String> loginData(){

        HashMap<String,String> hashMap=new HashMap<String,String>();
        hashMap.put("x","mercury@mercury");
        hashMap.put("y","mercury1@mercury1");
        hashMap.put("z","mercury2@mercury2");

        return hashMap;
    }

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\IdeaProjects\\UdemyPractice1\\Drivers\\chromedriver.exe");



        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.get("http://demo.guru99.com/test/newtours/");

        String credentials = loginData().get("x");
       String arr[]= credentials.split("@");
       driver.findElement(By.xpath("//*[@name='userName']")).sendKeys(arr[0]);
       driver.findElement(By.name("password")).sendKeys(arr[1]);
        driver.findElement(By.name("submit")).click();

        if (driver.getTitle().equals("Login: Mercury Tours")){
            System.out.println("Test Passed");
        }else
            {
            System.out.println("Test failed");

    }
    driver.findElement(By.linkText("Home")).click();



}
}
