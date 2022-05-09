import java.util.Scanner;

public class ageComparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Eneter first person's age");
        int Age_1= scan.nextInt();
        System.out.println("Eneter second person's age");
        int Age_2= scan.nextInt();
        System.out.println("Eneter third  person's age");
        int Age_3= scan.nextInt();
        personAge(Age_1,Age_2,Age_3);
    }
    public static void personAge(int person1, int person2,int person3){
        if(person1>person2 & person2 >person3){
            System.out.println(" Person with Age_1 is oldest and person with Age_3 is youngest.");
        }
        else if(person1>person2 & person3 >person2& person1>person3){
            System.out.println(" Person with Age_1 is oldest and person2 with Age_2 is youngest.");
        }else if(person1<person2 & person3 <person2& person1>person3){
            System.out.println(" Person3 with Age_3 is youngest and person2 with Age_2 is oldest.");
        }
        else if(person1<person2 & person3 >person2 & person1<person3){
            System.out.println(" Person1 with Age_1 is youngest and person3 with Age_3 is oldest.");
}else if(person1<person2 & person2 >person3 & person1 >person3 ){
            System.out.println(" Person2 with Age-2 is oldest and  person3 with GAe_2 is youngest");}
        else if(person1==person2 & person2 < person3 ){
            System.out.println(" Person1, person2 are are of equal age and younger than  person3. ");}
        else if(person1==person2 & person2 >person3 ){
            System.out.println(" Person1, person2 are are of equal age and older than  person3. ");}
        else if(person1>person2 & person3 >person2& person1<person3){
            System.out.println(" Person3 with Age_3 is oldest and person2 with Age_2 is youngest.");}
        else if(person1<person2 & person3 <person2 & person1<person3){
            System.out.println(" Person1 with Age_1 is youngest and person2 with Age_2 is oldest.");}
        else if(person1<person2 & person2 == person3 ){
            System.out.println(" Person2, person3 are are of equal age and older than  person1. ");}
        else if(person1>person2 & person2 == person3 ){
            System.out.println(" Person2, person3 are are of equal age and younger than  person1. ");}
        else if(person1==person3 & person2 >person3 ){
            System.out.println(" Person2, person3 are are of equal age and younger than  person1. ");}
        else if(person1==person3 & person2 < person3 ){
            System.out.println(" Person2, person3 are are of equal age and younger than  person1. ");}

        else{
            System.out.println("all the three people have same age");
        }
    }}
