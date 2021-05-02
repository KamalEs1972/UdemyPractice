package udemyPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class EbayPractive {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\IdeaProjects\\UdemyPractice1\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/loginpagePractise");
            //        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Korg");
            //        driver.findElement((By.cssSelector("#nav-search-submit-button"))).click();
            //        Thread.sleep(3000);
            //        List<WebElement>  products = driver.findElements(By.xpath("//div[@class='sg-col-inner']"));
            //        System.out.println(products.size());
            //        System.out.println(products.get(20));
            //        for (WebElement list : products) {
            //            String name = list.getText();
            //            System.out.println(name);
            //        }

        //*****************************************************

//            driver.findElement(By.xpath("//a[.='Click to load get data via Ajax!']")).click();
//         WebDriverWait w = new WebDriverWait(driver,5);
//         w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='results']")));
//          System.out.println(driver.findElement(By.xpath("//div[@id='results']")).getText());
  //      *****************************************************************

        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it=windows.iterator();
        String parentWindow=it.next();
        String childWindow=it.next();
        driver.switchTo().window(childWindow);
        String emailID=driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentWindow);
        driver.findElement(By.cssSelector("#username")).sendKeys(emailID);

    }

}
