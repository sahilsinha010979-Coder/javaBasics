import java.util.Scanner;

public class conditionals {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number:");
        int number1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter your second number:");
        int number2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Which operation would you like to perform:");
        String operation = scanner.nextLine();
        if(operation.equals("sum")){
            System.out.printf("%d + %d = %d", number1, number2, number1+number2);
        }
        else if(operation.equals("sub")){
            System.out.printf("%d - %d = %d",number1, number2, number1-number2);
        }
        else if(operation.equals("mul")){
            System.out.printf("%d * %d = %d", number1, number2, number1*number2);
        }
        else if(operation.equals("div")){
            if(number2==0){
                System.out.println("Cannot didvide by zero");
            }
            else{
                System.out.printf("%d / %d = %d", number1, number2, number1/number2);
            }
        }
        else{
            System.out.println("This operation is not supported at the moment");
        }
        scanner.close();
    }
}
