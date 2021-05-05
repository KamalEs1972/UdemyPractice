package udemyPractice1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStream {
   @Test
    public void streamMap(){
        List<String> names1= Arrays.asList("Majda","Omar","Ayoub","Lynn");
       List<String> names= Arrays.asList("Kamal","Imane","Rana","Gigi","Nina","Rachid","Robert");
        //names.stream().filter(s -> s.startsWith("R")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
            Stream<String> newNames = Stream.concat(names.stream(),names1.stream());
           // newNames.sorted().forEach(s -> System.out.println(s));
        boolean flag= newNames.anyMatch(s -> s.equalsIgnoreCase("Gigi"));

        Assert.assertTrue(flag);
    }
    @Test
    public void streamCollect(){
        List<String>ls= Stream.of("Carlota","Rana","Maria","Imane","Gigi").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).collect(Collectors.toList());

        System.out.println(ls.get(2));
        List<Integer> values=Arrays.asList(5,3,3,4,5,9,8,7);
        // Print unique number from this list
       // values.stream().distinct().sorted().forEach(s-> System.out.println(s));
        values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(values.get(3));




    }

}
