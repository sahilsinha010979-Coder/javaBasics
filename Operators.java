public class Operators {
    public static void main(String[] args){
        int number1 = 12;
        int number2 = 6;
        //Addition
        System.out.println(number1 + number2); //18
        //Subtraction
        System.out.println(number1-number2);    //6
        //Multiplication
        System.out.println(number1 * number2);  //72
        //Division
        System.out.println(number1/number2);    //2
        //Modulo
        System.out.println(number1%number2);    //0
        //Assignment operators
        int number = 5;
        number +=5; // number = number + 5
        //Comparison Opeators
        System.out.println(number1==number2);
        System.out.println(number1!=number2);
        System.out.println(number1>number2);
        System.out.println(number1>=number2);
        System.out.println(number1<number2);
        System.out.println(number1<=number2);
        
        //Logical operators
        // && => and
        // || => or
        // ! => not

        // Increment operators
        System.out.println(number++); // 10
        System.out.println(++number); // 12
        System.out.println(number--); // 12
        System.out.println(--number); // 10
    }
}
