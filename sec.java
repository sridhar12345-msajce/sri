import java.util.Scanner;

public class Pno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int number = input.nextInt();
        if(number>0){
            System.out.println("Number is positive "+number);

        }
        else if(number<0){
            System.out.println("Number is negative "+number);

        }
        else{
            System.out.println("Number is zero "+number);
        }
    }

}
