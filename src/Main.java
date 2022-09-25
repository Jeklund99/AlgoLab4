import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;

import org.omg.CORBA.INTERNAL;

public class Main {


    public static void main(String[] args) {

        Programmer Josh = new Programmer("Josh");
        Programmer Conner = new Programmer("Conner");
        Programmer Ryan = new Programmer("Ryan");

        ArrayList<Programmer> programmers = new ArrayList<>(Arrays.asList(Josh, Conner, Ryan));

        Company Intel = new Company("Intel");
        Company Microsoft = new Company("Microsoft");
        Company Apple = new Company("Apple");

        ArrayList<Company> companies = new ArrayList<>(Arrays.asList(Intel, Microsoft, Apple));

        
        Josh.preferences = new ArrayList<>(Arrays.asList(Apple, Intel, Microsoft));
        Conner.preferences = new ArrayList<>(Arrays.asList(Intel, Microsoft, Apple));
        Ryan.preferences = new ArrayList<>(Arrays.asList(Apple, Microsoft, Intel));

        Intel.preferences = new ArrayList<>(Arrays.asList(Conner, Josh, Ryan));
        Microsoft.preferences = new ArrayList<>(Arrays.asList(Ryan, Josh, Conner));
        Apple.preferences = new ArrayList<>(Arrays.asList(Conner, Ryan, Josh));

        

        Pair[] pairs = Algorithm.pairingAlgorithm(programmers, companies);


        // For manual testing: 
        // Pair testOne = new Pair(Apple, Ryan);
        // Pair testTwo = new Pair(Intel, Conner);
        // Pair testThree = new Pair(Microsoft, Josh);

        // System.out.println(Pair.isSatisfactory(testTwo, testThree));

        for (int i = 0; i < pairs.length; i++) {
            for (int j = i+1; j < pairs.length; j++) {
                System.out.println(Pair.isSatisfactory(pairs[i], pairs[j]));
            }
        }

        //System.out.println(pairs.length);

       System.out.println(Arrays.toString(pairs));

        

    }
}