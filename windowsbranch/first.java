import java.util.Scanner;
public class first{
    public static void main(String[] args) {

        System.out.print("enter your name: ");

        Scanner ask = new Scanner(System.in);

        String name = ask.nextLine();

        System.out.println("hi my name is " + name);
        int [] a = {2,4,6,4};    
        Members members = new Members();
        
        members.calculate();
        System.out.println("done with the sort");
    }
}

class Members{
    public static int size;
    public static boolean swapped;
    public static int i;
    public static int temp;


    static void calculate(){
        Scanner size1 = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        String size2 = size1.nextLine();
        Scanner limit_1 = new Scanner(System.in);
        System.out.print("enter the limit: ");
        
        String lim = limit_1.nextLine();

        int limit = Integer.parseInt(lim);


        size = Integer.parseInt(size2);
        System.out.println("the size of your array is: " + size);
        System.out.println("the size of your array is: " + limit);



        int [] array =  {1,4,7,7,8,0};
        do{
            swapped = false;

            for(i=0; i < array.length-1;i++){
                if(array[i] > array[i + 1]){
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapped = true;
                }

            }
        }while(swapped);{
            for(i=0; i< array.length ; i ++){
                System.out.println(array[i] + ",");
            }
        }


    }
}