public class Loops {
    public static void main(String[] args){
        for(int i=0;i<=10;i++){
            System.out.println(i);
        }
        // traversing an array using for loop
        int[] arr = {1,2,3,4,5};
        for(int number : arr){
            System.out.println(number);
        }
        //while loop
        int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }
        // do while loop
        int j = 0;
        do{
            System.out.println(j);
            j++;
        }
        while(j<10);
        
    }
}
