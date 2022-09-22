public class Pair {
    public Company company;
    public Programmer programmer;


    Pair(Company company, Programmer programmer) {
        this.company = company;
        this.programmer = programmer;
    }
    

    public String toString() {
        return "(" + this.company.name + ", " + this.programmer.name + ")";
    }
}
