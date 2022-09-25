import java.util.ArrayList;

public class Algorithm {

    public static Pair[] pairingAlgorithm(ArrayList<Programmer> programmers, ArrayList<Company> companies) {
        Pair[] pairs = new Pair[programmers.size()];
        int index = 0;
        // for (Programmer programmer : programmers) {
        //     Company favCompany = programmer.preferences.get(0);
        //     Pair pair = new Pair(favCompany, programmer);
        //     pairs[index] = pair;
        //     index++;
        // }

        for(Programmer programmer: programmers) {
            findMatch(programmer, companies);
        }

        for(Company company: companies) {
            pairs[index] = new Pair(company, company.currentProgrammer);
            index++;
            System.out.println("(" + company.currentProgrammer.name + ", " + company.name + ")");
        }
        return pairs;

    //     for (Programmer programmer: programmers) {
    //         int lowestSadnessRank = -1;
    //         Company lowestCompany = null;
    //         for(Company company: programmer.preferences){
    //             int sadnessRank = company.preferences.indexOf(programmer) + programmer.preferences.indexOf(company);
    //             // First conditional is for when we are checking the first company, since there is nothing to compare it to
    //             // We know that it is automatically the lowestSadnessRank

    //             if(!company.paired && lowestSadnessRank == -1) {
    //                 lowestSadnessRank = sadnessRank;
    //                 lowestCompany = company;
    //             }
    //             else if (sadnessRank < lowestSadnessRank && !company.paired) {
    //                 lowestSadnessRank = sadnessRank;
    //                 lowestCompany = company;
    //             }
    //     }

    //     pairs[index] = new Pair(lowestCompany, programmer);
    //     lowestCompany.paired = true;
    //     programmer.paired = true;
    //     index++;
    // }

    // for(int i = 0; i < pairs.length; i++) {
    //     Programmer firstProgrammer = pairs[i].programmer;
    //     Company firstCompany = pairs[i].company;


    // }


    // public static pairingAlgorithm2(ArrayList<Programmer> programmers, ArrayList<Company> companies) {
    //     for(Programmer pr: programmers) {

    //     }
    // }

        
    }
    

    public static void findMatch(Programmer pr, ArrayList<Company> companies) {
            //Company firstChoice = pr.preferences.get(0);

            for(Company company: pr.preferences) {
                 if(company.paired) {
                    //System.out.println("I am being called2");
                    Programmer currentlyPairedProgrammer = company.currentProgrammer;
                    //System.out.println(company.preferences.indexOf(pr));
                    if(company.preferences.indexOf(pr) < company.preferences.indexOf(currentlyPairedProgrammer)) {
                        //System.out.println("I am being called");
                        company.currentProgrammer = pr;
                        findMatch(currentlyPairedProgrammer, companies);
                        return;
                    }
                 }
                 else {
                    company.currentProgrammer = pr;
                    company.paired = true;
                    return;
                 }

            }
    }
}
