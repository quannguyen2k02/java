
public class Second {
    public static void main(String[] args) {
        Main human =new Main("Nguyen", "Quan", 2002);
        System.out.println("Name: "+ human.fName + " " + human.lName);
        System.out.println("Age: "+ human.age());
        System.out.println("That's all");
    }
}
