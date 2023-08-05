public class sort {
    public static void main(String[] args){
        
        sort_array();
    }
    public static void  sort_array(){
    int [] num = {4,7,1,7,0,5};

    int temp ; 
    boolean swapped;

    do {
        swapped = false;

        for ( int i = 0; i < num.length-1 ; i++){
            if(num[i] > num[i+ 1]){
                temp = num[i];
                num[i] = num[i + 1];
                num[ i + 1] = temp;
                swapped = true;
            }
        }
    }while (swapped);
    for(int i = 0; i < num.length; i ++){
        System.out.println(num[i]+ "");
    }

}

}

