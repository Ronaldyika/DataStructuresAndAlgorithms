package OOP;
import java.util.Scanner;

public class Classes {
    public static void main(String[] args){
        System.out.println("oop is so cool");

        //instantiating the car class

        Cars ferari = new Cars( "flyx" ,"enginx" ,200);
        Cars lambogini = new Cars("lambogini","turtle",200);
        lambogini.name = "lambogini";

        lambogini.greetings();

        ferari.greetings();

        Array num1 = new Array();
        num1.Insertion(0, 6);

    }


}
    class Cars{
        String name;
        String engine ;
        int price;

        Cars(String name,String engine,int price){
            this.name = name;
            this.engine = engine;
            this.price = price;
        }
        void greetings(){
            System.out.println("hello my name is "+ this.name);
        }
    }
    
    class Array{
        int i;
        int size;

        void Insertion(int i, int size){
            System.out.println("this insertion is taking in vals \n");
            this.i = i;
            this.size = size;

            Array num = new Array();

            int [] a = new int[5];

            if(size < 5){
                System.out.println("this is imposible to insert into array");
                
            }else if(size > 5){

                Scanner response = new Scanner(System.in);

                System.out.println("insert items into array: ");

                String number  = response.nextLine();

                System.out.println(number);

                

            }


        }
    }
    
