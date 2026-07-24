import java.util.Scanner;
public class Switch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");
        int number1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter second number:");
        int number2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Which operation would you like to do:");
        String operation = scanner.nextLine();
        switch(operation){
            case "sum":
                System.out.printf("%d + %d = %d", number1, number2, number1+number2);
                break;
            case "sub":
                System.out.printf("%d - %d = %d", number1, number2, number1-number2);
                break;
            case "mul":
                System.out.printf("%d * %d = %d", number1, number2, number1*number2);
                break;
            case "div":
                if(number2==0){
                System.out.println("Cannot didvide by zero");
                }
                else{
                System.out.printf("%d / %d = %d", number1, number2, number1/number2);
                }
                break;
            default:
                System.out.println("This operation is not supported at the moment");
        }
        scanner.close();
    }
}
