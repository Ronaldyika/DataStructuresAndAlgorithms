import java.util.Scanner;
public class inheritance {
    
    public static void main(String[] args){
        System.out.println("this code will be explaining inheritance \n");

        Scanner name = new Scanner(System.in);

        System.out.println("what is your age: ");

        String firstname = name.nextLine();

        Parent elders = new Parent();
        
        child inherited = new child();

        elders.Functions();
        inherited.greetings();

    }
}

class Parent{
    String name;
    Boolean Marraid;
    int age ;


    void  Functions(){
        
        Scanner firstname = new Scanner(System.in);

        System.out.println("enter your name: ");
        
        name = firstname.nextLine();

        System.out.println("greetings honourable " + this.name);
    }
}

class child extends Parent{
    String School;
    String food;

    void greetings(){
        Scanner firstname = new Scanner(System.in);

        System.out.println("enter your name: ");

        name = firstname.nextLine();

        
        Scanner schol = new Scanner(System.in);
        System.out.println("enter your school name: ");

        School = schol.nextLine();

        System.out.println("hi my name is " + this.name + " i am school in " + this.School);

    }
}
