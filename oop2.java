
public class oop2 extends oop{
    private String place;
    public void input1(){
        System.out.println("Enter place: ");
        sc.nextLine();
        place=sc.nextLine();
    }
    public void display2(){
        System.out.println("Place: "+place );
    }
    public static void main(String[] args) {
        oop2 human=new oop2();
        human.input();
        human.input1();
        human.display();
        human.display2();
    }
}
