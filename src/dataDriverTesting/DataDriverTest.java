package dataDriverTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class DataDriverTest {
    WebDriver driver;

    @BeforeClass
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\IdeaProjects\\UdemyPractice1\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


    }

    @Test(dataProvider = "LoginData")
    public void loginTest(String user, String psw, String expected) {
        driver.get("https://admin-demo.nopcommerce.com/login");
        // System.out.println(user + psw  +  expected);
        WebElement textEmail = driver.findElement(By.xpath("//input[@id='Email']"));
        WebElement textPassword = driver.findElement(By.id("Password"));
        WebElement loginBtn = driver.findElement(By.cssSelector("button[type='submit']"));
        textEmail.clear();
        textEmail.sendKeys(user);
        textPassword.clear();
        textPassword.sendKeys(psw);
        loginBtn.click();

        String expectedTitle = "Dashboard / nopCommerce administration";
        String actualTitle = driver.getTitle();

        if (expected.equals("valid")) {
            if (expectedTitle.equals(actualTitle)) {
                driver.findElement(By.linkText("Logout")).click();
                Assert.assertTrue(true);
            } else {
                Assert.assertTrue(false);
            }
        } else if (expected.equals("invalid")) {
            if (expectedTitle.equals(actualTitle)) {
            }
            driver.findElement(By.linkText("Logout")).click();
            Assert.assertTrue(false);
        } else {
            Assert.assertTrue(false);
        }

    }

    @DataProvider(name = "LoginData")
    public Object[][] getData() throws IOException {


//        String loginData[][]= {
//                {"admin@yourstore.com","admin","valid"},
//                {"admin@yourstore.com","adm","invalid"},
//                {"adm@yourstore.com","admin","invalid"},
//                {"admin@yourstore.com","adm","invalid"}
//                };
        String path = "E:\\QE Automation\\ExcelData\\Login.xlsx";
        XLUtility xlUtility = new XLUtility(path);
        int totalRows = xlUtility.getRowCount("Sheet1");
        int totalCols = xlUtility.getCellCount("Sheet1", 1);
        String loginData[][] = new String[totalRows][totalCols];

        for (int i = 1; i <= totalRows; i++)
        {
            for (int j = 0; j < totalCols; j++)
            {
                loginData [i-1][j]=xlUtility.getCellData("Sheet1",i,j);
            }
            }

            return loginData;
        }
        @AfterClass
        void tearDown () {
            driver.close();
        }
    }


