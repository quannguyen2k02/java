import java.util.Scanner;
public class oop {
    private String fName, lName, fullName;
    private int year, old;
    Scanner sc=new Scanner(System.in);
    public void input(){
        System.out.println("Enter first name: ");
        fName= sc.nextLine();
        System.out.println("Enter last name: ");
        lName=sc.nextLine();
        fullName=fName+" "+lName;
        System.out.println("Enter year: ");
        year=sc.nextInt();
        old=2023-year;
    }
    public void display(){
        System.out.println("Full name: "+fullName);
        System.out.println("Old: "+old);
    }
}
