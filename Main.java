import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("What's Up, World!");

        int num = 10;
        String s = "I have in my collection " + num + " vinyl records";
        System.out.println(s);

        String a1 = new String("What do you want on your pizza?");
        String a2 = new String(" I like mushrooms.");
        String a3 = a1 + a2;
        System.out.println(a3);

        Bands[] bands = new Bands[] {
            new Bands("The Rolling", "Stones"),
            new Bands("Grateful", "Dead"),
            new Bands("Allman", "Brothers"),
        };
        for (Bands xy : bands) {
            xy.printFullName();
        }

    }
}