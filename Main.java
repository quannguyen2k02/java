public class Main{
    String fName, lName;
    int year;
    public Main(String fName, String lName, int year){
        this.fName=fName;
        this.lName=lName;
        this.year=year;
    }
    public int age(){
        return 2023-year;
    }
}