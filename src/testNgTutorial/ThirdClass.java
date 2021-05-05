package testNgTutorial;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class ThirdClass {


    @Test(groups = "Smoke")
    public void demo4(){


        System.out.println("demo4");
    }
    @AfterSuite
    public void afterSuite(){


        System.out.println("After Suite");
    }
}
