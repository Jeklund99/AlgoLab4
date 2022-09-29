public class Pair {
    public Company company;
    public Programmer programmer;


    Pair(Company company, Programmer programmer) {
        this.company = company;
        this.programmer = programmer;
    }

    public static boolean isSatisfactory(Pair firstPair, Pair secondPair){
        Programmer pOne = firstPair.programmer;
        Company cOne = firstPair.company;

        Programmer pTwo = secondPair.programmer;
        Company cTwo = secondPair.company;


        if(pOne.preferences.indexOf(cTwo) < pOne.preferences.indexOf(cOne) && 
        cTwo.preferences.indexOf(pOne) < cTwo.preferences.indexOf(pTwo)){
            return false;
        } 
        
        else if (pTwo.preferences.indexOf(cOne) < pTwo.preferences.indexOf(cTwo) && 
        cOne.preferences.indexOf(pTwo) < cOne.preferences.indexOf(pOne)) {
            return false;
        }

        return true;
    }
    

    public String toString() {
        return "(" + this.company.name + ", " + this.programmer.name + ")";
    }
}
