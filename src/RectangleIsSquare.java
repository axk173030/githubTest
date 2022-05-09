import java.util.Scanner;

public class RectangleIsSquare {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length");
        int l = scan.nextInt();
        System.out.println("Enter the breadth");
        int b = scan.nextInt();
        checkSquare(l,b);
    }
     public static void checkSquare (int length,int breadth){
        if (length == breadth){
            System.out.println("The rectangle is a square");
        }else{
            System.out.println("The rectangle is not a square");
        }
    }
}
