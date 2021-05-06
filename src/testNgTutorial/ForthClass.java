package testNgTutorial;

import org.junit.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ForthClass {
    @Test
    public void demo5() {


        System.out.println("Demo5");
    }

    @Test(dependsOnMethods = {"demo8"})
    public void demo6() {

        System.out.println("demo6");

    }

    @Test
    public void beforeClass() {


        System.out.println("Before Class");
        Assert.assertTrue(false);
    }
        @Test(groups = "Smoke")
        public void demo7 () {


            System.out.println("demo7");
        }
      @Parameters("url1")
        @Test
        public void demo8 (String name) {

            System.out.println(name);

        }
    }
