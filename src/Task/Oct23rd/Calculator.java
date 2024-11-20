package Task.Oct23rd;

 import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first Number");
        int first_number = scanner.nextInt();
        System.out.println("Enter the Second Number");
        int second_number = scanner.nextInt();

        int sum = sum_of_two_number(first_number,second_number);
        int sub = sub_of_two_number(first_number,second_number);
        int mul = mul_of_two_number(first_number,second_number);
        int div = div_of_two_number(first_number,second_number);

        System.out.println("Addition = " + sum);
        System.out.println("Subtraction = " + sub);
        System.out.println("Multiplication = " + mul);
        System.out.println("Division = " + div);
    }

    static int sum_of_two_number(int firstNumber, int second_number){
        return firstNumber + second_number;

    }
    static int sub_of_two_number(int firstNumber, int second_number){
        return firstNumber - second_number;

    }
    static int mul_of_two_number(int firstNumber, int second_number){
        return firstNumber * second_number;

    }
    static int div_of_two_number(int firstNumber, int second_number){
        return firstNumber / second_number;

    }
}
