import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Whats your name?");
        String name = input.nextLine();

        System.out.println("Whats your age?");
        int age = input.nextInt();

        if(age < 1){
            System.out.println("Incvalid");

        } else if(age < 20){
            System.out.println(name + " you are under age");

        } else {
            System.out.println(name + " you are of legal age");
        }
        input.close();
    }
}