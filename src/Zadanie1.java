import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Write your name ");

        String surname = sc.nextLine();
        System.out.println("Write yout surname ");

        int age = sc.nextInt();
        System.out.println("What is your age");

        System.out.println("Your name: " + name + "Your surname: " + surname + "Your age: " + age);

        


    }
}
