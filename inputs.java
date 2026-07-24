import java.util.Scanner;

public class inputs{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name:");
        String name = scanner.nextLine();
        System.out.printf("Hello %s.You are welcome on board. What is your age?", name);
        int age = scanner.nextInt();
        System.out.printf("%d is a fantastics age to start programming.\n", age);
        scanner.nextLine();
        System.out.println("Which programming language are you currently into?");
        String language = scanner.nextLine();
        System.out.printf("%s is a very popular programming language", language);
        scanner.close();
    }
}