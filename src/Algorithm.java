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

        for (Programmer programmer: programmers) {
            for(Company company: programmer.preferences){
                if(!company.paired){
                    pairs[index] = new Pair(company, programmer);
                    company.paired = true;
                    programmer.paired = true;
                    index++;
                    break;
                }
            }
        }

        return pairs;
    }
    
}
