import java.util.Scanner;

public class sixth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  values:");
        int n = sc.nextInt();
        sc.nextLine();
        if(n==0){
            System.out.println("NO values");
        }
        else{
            String[] values = new String[n];
            System.out.println("Enter values:");
            for(int i=0;i<n;i++){
                values[i] = sc.nextLine();
            }
            for(int i=0;i<n;i++){
                System.out.println(values[i]);
                if(i<n-1){
                    System.out.print(",");

                }
            }
        }
        sc.close();
    }

}
