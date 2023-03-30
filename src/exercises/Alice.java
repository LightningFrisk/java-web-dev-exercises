package exercises;
import java.util.Scanner;


public class Alice {
   public static void main(String[] args) {
       System.out.println("Hello, World");
       Scanner input = new Scanner(System.in);
       System.out.println ("Hello, what is your name?:");
       String name = input.nextLine();
       System.out.println ("Hello " + name);
   }
}
