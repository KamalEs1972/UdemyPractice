package testNgTutorial;

import org.testng.annotations.*;

public class FirstClass {
    @Test(dataProvider = "getData")
    public void last(String username,String password) {


        System.out.println("After Test");
        System.out.println(username);
        System.out.println(password);
    }

    @Parameters({"url", "API/UserName"})
    @Test
    public void demo1(String urlName, String key) {


        System.out.println("demo1");
        System.out.println(urlName);
        System.out.println(key);

    }

    @Test(groups = "Smoke")
    public void demo2() {

        System.out.println("demo2");
    }

    @BeforeMethod
    public void beforeMethod() {


        System.out.println("Before Method");
    }

    @AfterClass
    public void afterClass() {

        System.out.println("After Class");
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][2];
        data[0][0]="username1";
        data[0][1]="password1";
        data[1][0]="username2";
        data[1][1]="password2";
        data[2][0]="username3";
        data[2][1]="password3";

        return data;




    }

}
