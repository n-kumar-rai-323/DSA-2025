import java.util.Scanner;

public class creating {
    public static void main(String[] args) {
       String fruits[]={"apple", "mango", "banana"};
       System.out.println(fruits.length);

       int marks[]= new int[100];
       Scanner sc = new Scanner(System.in);

       marks[0]= sc.nextInt();
       marks[1]=sc.nextInt();
       System.out.println("phy: " + marks[0]);
    }
}
