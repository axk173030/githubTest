import java.util.Scanner;

public class greatestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int a = scan.nextInt();
        System.out.println("enter second  number");
        int b = scan.nextInt();
        method(a,b);

    }
    public static void method(int number1, int number2){
        if(number1>number2){
            System.out.println("a is bigger than b");
        }else if (number1<number2){
            System.out.println("b is bigger than a");
        }else{
            System.out.println("a and b are equal");
        }
    }

}
