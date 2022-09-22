import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;

import org.omg.CORBA.INTERNAL;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        Programmer Josh = new Programmer();
        Programmer Conner = new Programmer();
        Programmer Ryan = new Programmer();


        Company Intel = new Company();
        Company Microsoft = new Company();
        Company Apple = new Company();

        
        Josh.preferences = new ArrayList<>(Arrays.asList(Intel, Microsoft, Apple));
        Conner.preferences = new ArrayList<>(Arrays.asList(Microsoft, Intel, Apple));
        Ryan.preferences = new ArrayList<>(Arrays.asList(Apple, Microsoft, Intel));

        Intel.preferences = new ArrayList<>(Arrays.asList(Conner, Ryan, Josh));
        Microsoft.preferences = new ArrayList<>(Arrays.asList(Ryan, Conner, Josh));
        Apple.preferences = new ArrayList<>(Arrays.asList(Conner, Josh, Ryan));

        

    }
}