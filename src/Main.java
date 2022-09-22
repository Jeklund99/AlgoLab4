import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;

import org.omg.CORBA.INTERNAL;

public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        Programmer Josh = new Programmer("Josh");
        Programmer Conner = new Programmer("Conner");
        Programmer Ryan = new Programmer("Ryan");

        ArrayList<Programmer> programmers = new ArrayList<>(Arrays.asList(Josh, Conner, Ryan));

        Company Intel = new Company("Intel");
        Company Microsoft = new Company("Microsoft");
        Company Apple = new Company("Apple");

        ArrayList<Company> companies = new ArrayList<>(Arrays.asList(Intel, Microsoft, Apple));

        
        Josh.preferences = new ArrayList<>(Arrays.asList(Intel, Microsoft, Apple));
        Conner.preferences = new ArrayList<>(Arrays.asList(Microsoft, Intel, Apple));
        Ryan.preferences = new ArrayList<>(Arrays.asList(Apple, Microsoft, Intel));

        Intel.preferences = new ArrayList<>(Arrays.asList(Conner, Ryan, Josh));
        Microsoft.preferences = new ArrayList<>(Arrays.asList(Ryan, Conner, Josh));
        Apple.preferences = new ArrayList<>(Arrays.asList(Conner, Josh, Ryan));

        

        Pair[] pairs = Algorithm.pairingAlgorithm(programmers, companies);

        System.out.println(Arrays.toString(pairs));

        

    }
}