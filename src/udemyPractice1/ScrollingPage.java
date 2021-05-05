package udemyPractice1;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.List;

public class ScrollingPage {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\IdeaProjects\\UdemyPractice1\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://rahulshettyacademy.com/AutomationPractice/#");


//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("window.scrollBy(0,750)");
        //Thread.sleep(3000);

//        js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=500");
//        List<WebElement> values=driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
//        int sum=0;
//        for(int i=0 ; i <values.size();i++)
//        {
//            sum = sum+(Integer.parseInt(values.get(i).getText()));
//
//
//        }
//        System.out.println(sum);
//        int total= Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
//        System.out.println(total);
//        Assert.assertEquals(sum,total);

//        driver.manage().window().maximize();
//
//        WebElement table = driver.findElement(By.id("product"));
//
//        System.out.println(table.findElements(By.tagName("tr")).size());
//
//        System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
//
//        List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//
//
//
//        System.out.print( secondrow.get(0).getText());
//
//        System.out.print("\t"+"\t"+ secondrow.get(1).getText());
//
//        System.out.print("\t"+"\t"+ secondrow.get(2).getText());

        driver.findElement(By.cssSelector("#autocomplete")).sendKeys("unit");

        Thread.sleep(2000);

        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.ENTER);


        System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));


        //  Actions  actions = new Actions(driver);
        //Retrieve WebElement 'Music' to perform mouse hover
        //WebElement united =
     //   driver.findElement(By.cssSelector("#ui-id-57")).click();
        //Mouse hover menuOption 'Music'
//        actions.moveToElement(united).perform();
//        System.out.println("Done Mouse hover on 'Music' from Menu");
    }




}