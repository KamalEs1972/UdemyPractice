package udemyPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;






public class HandlingJavaAlerts {


    public static void main(String[] args)  {


        String text = "Kamal";

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\IdeaProjects\\UdemyPractice1\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://www.cleartrip.com/");
       driver.findElement(By.cssSelector("#name")).sendKeys(text);
       driver.findElement(By.id("alertbtn")).click();
//        driver.findElement(By.id("confirmbtn")).click();
//        System.out.println(driver.switchTo().alert().getText());
//        driver.switchTo().alert().dismiss();
        // Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"ORtrip\"]/section[2]/div[1]/dl/dd/div/a/i")).click();
        driver.findElement(By.xpath("//div[@class='monthBlock first']//a[.='29']")).click();
        Select adult = new Select(driver.findElement(By.cssSelector("#Adults")));
        adult.selectByVisibleText("4");

        Select child = new Select(driver.findElement(By.xpath("//select[@id='Childrens']")));
        child.selectByIndex(2);

        driver.findElement(By.xpath("//strong[normalize-space()='More options:']")).click();
        driver.findElement(By.xpath("//input[@id='AirlineAutocomplete']")).sendKeys("IAD");
        driver.findElement(By.xpath("//input[@id='SearchBtn']")).click();
        System.out.println(driver.findElement(By.xpath("//div[@id='homeErrorMessage']")).getText());

    }






    }

