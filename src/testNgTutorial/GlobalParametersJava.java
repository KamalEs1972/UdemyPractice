package testNgTutorial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalParametersJava {
    public static void main(String[] args) throws IOException {


        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\USER\\IdeaProjects\\UdemyPractice1\\src\\testNgTutorial\\data.properties");
        prop.load(fis);
        System.out.println(prop.getProperty("browser"));
        System.out.println(prop.getProperty("url"));
        prop.setProperty("browser","Firefox");
        System.out.println(prop.getProperty("browser"));
        FileOutputStream fos = new FileOutputStream("C:\\Users\\USER\\IdeaProjects\\UdemyPractice1\\src\\testNgTutorial\\data.properties");
        prop.store(fos,null);



    }
}
