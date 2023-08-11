import java.util.Scanner;

public class array{
    public static void main(String[] args) {

        int num1,num2;
        num1 = 3;num2 = 3;

        if(num1 > num2){
            System.out.println("num1 is higher ");
        }else if(num2 > num1){
            System.out.println("num2 is higher");
        }else{
            System.out.println("the numbers are same ");
            System.out.println("you can end here");
        }

        Scanner obj1 = new Scanner(System.in);

        System.out.println("enter a name: \n");

        String name = obj1.nextLine();

        System.out.println("my name is " + name);


}
}