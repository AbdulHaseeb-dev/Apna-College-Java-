import java.util.Scanner;

// Print all even numbers till n

public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int n = sc.nextInt();

        for(int i=2;i<=n;i=i+2) {
            System.out.println(i);
        }
        sc.close();
    }
}
