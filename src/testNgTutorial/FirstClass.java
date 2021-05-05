package testNgTutorial;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstClass {
    @AfterTest
    public void last(){


        System.out.println("After Test");
    }
    @Test
    public void demo1(){


        System.out.println("demo1");
    }
    @Test(groups = "Smoke")
    public void demo2(){

        System.out.println("demo2");
    }
    @BeforeMethod
    public void beforeMethod(){


        System.out.println("Before Method");
    }
    @AfterTest
    public void afterClass(){

        System.out.println("After Class");
    }
}
