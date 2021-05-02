package udemyPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ClickElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class WallGreenLinksCount {

    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\IdeaProjects\\UdemyPractice1\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        driver.findElement(By.cssSelector("#checkBoxOption2")).click();
        String label2=driver.findElement(By.cssSelector("label[for='benz']")).getText();
        System.out.println(label2);

        Select option = new Select(driver.findElement(By.id("dropdown-class-example")));
        option.selectByVisibleText(label2);
        driver.findElement(By.name("enter-name")).sendKeys(label2);
        driver.findElement(By.cssSelector("#alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();


//        WebElement links2 = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td/ul"));
//        int links=links2.findElements(By.tagName("a")).size();
//        System.out.println(links);
//        for(int i=1;i<links ; i++) {
//            String clickCountedLinks = Keys.chord(Keys.CONTROL, Keys.ENTER);
//            links2.findElements(By.tagName("a")).get(i).sendKeys(clickCountedLinks);
//
//            //Thread.sleep(5000);
//        }
//            Set<String> windows = driver.getWindowHandles();
//            Iterator<String> it;
//            it = windows.iterator();
//
//            while (it.hasNext()) {
//                driver.switchTo().window(it.next());
//                System.out.println(driver.getTitle());
//            }
//
        }



//      driver.get("https://www.walgreens.com/");
//        WebElement links =  driver.findElement(By.cssSelector(".footer__links"));
//        System.out.println(links.findElements(By.tagName("a")).size());
//        WebElement links2=driver.findElement(By.xpath("//div[@class='footer__links']/div/div/div[1]"));
//        System.out.println(links2.findElements(By.tagName("a")).size());
    }

