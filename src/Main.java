import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;

import org.omg.CORBA.INTERNAL;

// Code written by: Conner Hettinger and Josh Eklund

// In the main method, there are three different "pre"-cases that we wrote about.
// So, in order to run a specific case you have to comment all other cases out and
// uncomment the case you want. If you want to make your own yuo have to go through
// the tedious steps of making new programmers and companies with preferences.

public class Main {


    public static void main(String[] args) {

        
        // //Test Case 1
        // //-----------------------------------------------------------------
        // Programmer Josh = new Programmer("Josh");
        // Programmer Conner = new Programmer("Conner");
        // Programmer Ryan = new Programmer("Ryan");

        // ArrayList<Programmer> programmers = new ArrayList<>(Arrays.asList(Josh, Conner, Ryan));

        // Company Intel = new Company("Intel");
        // Company Microsoft = new Company("Microsoft");
        // Company Apple = new Company("Apple");

        // ArrayList<Company> companies = new ArrayList<>(Arrays.asList(Intel, Microsoft, Apple));

        
        // Josh.preferences = new ArrayList<>(Arrays.asList(Apple, Intel, Microsoft));
        // Conner.preferences = new ArrayList<>(Arrays.asList(Intel, Microsoft, Apple));
        // Ryan.preferences = new ArrayList<>(Arrays.asList(Apple, Microsoft, Intel));

        // Intel.preferences = new ArrayList<>(Arrays.asList(Conner, Josh, Ryan));
        // Microsoft.preferences = new ArrayList<>(Arrays.asList(Ryan, Josh, Conner));
        // Apple.preferences = new ArrayList<>(Arrays.asList(Conner, Ryan, Josh));



        //Test Case 2
        //--------------------------------------------------------------------------
        // Programmer Nic = new Programmer("Nic");
        // Programmer Blake = new Programmer("Blake");
        // Programmer Joshua = new Programmer("Joshua");
        // Programmer Ash = new Programmer("Ash");

        // ArrayList<Programmer> programmers = new ArrayList<>(Arrays.asList(Nic, Blake, Joshua, Ash));

        // Company Intel = new Company("Intel");
        // Company Microsoft = new Company("Microsoft");
        // Company Apple = new Company("Apple");
        // Company jeffBezos = new Company("jeffBezos");

        // ArrayList<Company> companies = new ArrayList<>(Arrays.asList(Intel, Microsoft, Apple, jeffBezos));

        
        // Nic.preferences = new ArrayList<>(Arrays.asList(Microsoft, Apple, jeffBezos, Intel));
        // Blake.preferences = new ArrayList<>(Arrays.asList(Microsoft, jeffBezos, Apple, Intel));
        // Joshua.preferences = new ArrayList<>(Arrays.asList(Intel, jeffBezos, Apple, Microsoft));
        // Ash.preferences = new ArrayList<>(Arrays.asList(jeffBezos, Intel, Apple, Microsoft));

        // Intel.preferences = new ArrayList<>(Arrays.asList(Nic, Blake, Joshua, Ash));
        // Microsoft.preferences = new ArrayList<>(Arrays.asList(Ash, Joshua, Blake, Nic));
        // Apple.preferences = new ArrayList<>(Arrays.asList(Nic, Ash, Joshua, Blake));
        // jeffBezos.preferences = new ArrayList<>(Arrays.asList(Blake, Ash, Joshua, Nic));

        // //Test Case 3
        // //--------------------------------------------------------------------------
        Programmer Daniel = new Programmer("Daniel");
        Programmer Yubo = new Programmer("Yubo");
        Programmer Gregory = new Programmer("Gregory");
        Programmer Mason = new Programmer("Mason");
        Programmer Lloyd = new Programmer("Lloyd");

        ArrayList<Programmer> programmers = new ArrayList<>(Arrays.asList(Daniel, Yubo, Gregory, Mason, Lloyd));

        Company Intel = new Company("Intel");
        Company Microsoft = new Company("Microsoft");
        Company Apple = new Company("Apple");
        Company jeffBezos = new Company("jeffBezos");
        Company markZucc = new Company("MarkZucc");

        ArrayList<Company> companies = new ArrayList<>(Arrays.asList(Intel, Microsoft, Apple, jeffBezos, markZucc));

        
        Daniel.preferences = new ArrayList<>(Arrays.asList(Intel, Apple, jeffBezos, markZucc, Microsoft));
        Yubo.preferences = new ArrayList<>(Arrays.asList(markZucc, Microsoft, Intel, Apple, jeffBezos));
        Gregory.preferences = new ArrayList<>(Arrays.asList(jeffBezos, markZucc, Apple, Microsoft, Intel));
        Mason.preferences = new ArrayList<>(Arrays.asList(Intel, Apple, Microsoft, markZucc, jeffBezos));
        Lloyd.preferences = new ArrayList<>(Arrays.asList(Microsoft, Apple, jeffBezos, Intel, markZucc));

        Intel.preferences = new ArrayList<>(Arrays.asList(Daniel, Yubo, Gregory, Mason, Lloyd));
        Microsoft.preferences = new ArrayList<>(Arrays.asList(Yubo, Daniel, Lloyd, Mason, Gregory));
        Apple.preferences = new ArrayList<>(Arrays.asList(Lloyd, Gregory, Mason, Daniel, Yubo));
        jeffBezos.preferences = new ArrayList<>(Arrays.asList(Gregory, Daniel, Mason, Yubo, Lloyd));
        markZucc.preferences = new ArrayList<>(Arrays.asList(Mason, Gregory, Yubo, Lloyd, Daniel));

        

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