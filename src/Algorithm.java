import java.util.ArrayList;

public class Algorithm {

    public static Pair[] pairingAlgorithm(ArrayList<Programmer> programmers, ArrayList<Company> companies) {
        Pair[] pairs = new Pair[programmers.size()];
        int index = 0;

        // This runs the recursive function on each programer.
        for(Programmer programmer: programmers) {
            findMatch(programmer);
        }

        //This is just a for loop to help to help making pairs, so we can check if they are true in main
        for(Company company: companies) {
            pairs[index] = new Pair(company, company.currentProgrammer);
            index++;
            System.out.println("(" + company.currentProgrammer.name + ", " + company.name + ")");
        }
        return pairs;

        
    }
    

    public static void findMatch(Programmer pr) {
            //Loop through every company in the programmers preferences
            for(Company company: pr.preferences) {
                //Check if the company is paired
                 if(company.paired) {
                    //If the company is paired, then grab the programmer that is currently paired with the company
                    Programmer currentlyPairedProgrammer = company.currentProgrammer;
                    //Check if company ranks the programmer we are trying to pair higher than their currently paired programmer
                    if(company.preferences.indexOf(pr) < company.preferences.indexOf(currentlyPairedProgrammer)) {
                        //If they do, swap programmers and find a new match for the unmatched programmer
                        company.currentProgrammer = pr;
                        findMatch(currentlyPairedProgrammer);
                        return;
                    }
                 }
                 //Else company is not paired and we pair the programmer to the comapny
                 else {
                    company.currentProgrammer = pr;
                    company.paired = true;
                    return;
                 }

            }
    }
}
