import java.util.Scanner;
public class englishLetterCheck {
    public static void main(String[] args) {

            char ch=3;
            Scanner scan=new Scanner(System.in);


        int m = (int) ch;

            System.out.println("Enter the character ");
            m=scan.next().charAt(0);
            if(m>64 && m<=91){
                System.out.println(ch+" is an upper case letter ");
            }
            else if(m>96 && m < 123){
                System.out.println(ch+" is a lower case letter ");
            }
            else{
                System.out.println(ch+" is not a Alphabets ");
            }
        }
    }



