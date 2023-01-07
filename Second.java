import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Main human =new Main();
        Scanner sc=new Scanner(System.in);
        human.fName=sc.next();
        human.fName=sc.next();
        human.year=sc.nextInt();
        human.fullName();
        System.out.print(human.age());
    }
}
