package testNgTutorial;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ForthClass {
    @Test
    public void demo5() {


        System.out.println("Demo5");
    }

    @Test
    public void demo6() {

        System.out.println("demo6");

    }

    @BeforeClass
    public void beforeClass() {


        System.out.println("Before Class");
    }
        @Test(groups = "Smoke")
        public void demo7 () {


            System.out.println("demo7");
        }
        @BeforeTest
        public void demo8 () {

            System.out.println("Before Test");

        }
    }
