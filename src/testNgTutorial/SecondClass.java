package testNgTutorial;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SecondClass {


    @Test(groups = "Smoke")
    public void demo3(){


        System.out.println("demo3");
    }
    @BeforeSuite
    public void beforeSuite(){


        System.out.println("Before Suite");
    }
}
