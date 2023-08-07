import java.util.Scanner;
public class first{
    public static void main(String[] args) {

        System.out.print("enter your name: ");

        Scanner ask = new Scanner(System.in);

        String name = ask.nextLine();

        System.out.println("hi my name is " + name);
        
        
    }
}