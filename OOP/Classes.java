package OOP;

public class Classes {
    public static void main(String[] args){
        System.out.println("oop is so cool");

        //instantiating the car class

        Cars ferari = new Cars( "flyx" ,"enginx" ,200);
        Cars lambogini = new Cars("lambogini","turtle",200);
        lambogini.name = "lambogini";

        lambogini.greetings();
        
        ferari.greetings();

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
    
