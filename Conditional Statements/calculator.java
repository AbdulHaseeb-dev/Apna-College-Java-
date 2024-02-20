import java.util.Scanner;

// calculator using switch statements

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int a = sc.nextInt();

        System.out.println("Enter Second Number:");
        int b = sc.nextInt();

        System.out.println("Enter Operator (1: +, 2: -, 3: *, 4: /, 5: %) ");
        int Operator = sc.nextInt();

        switch (Operator) {
            case 1:
                System.out.println(a + b);
                break;

            case 2:
                System.out.println(a - b);
                break;

            case 3:
                System.out.println(a * b);
                break;

            case 4:
                if (b == 0) {
                    System.out.println("Invalid response");
                } else {
                    System.out.println(a / b);
                }
                break;

            case 5:
                if (b == 0) {
                    System.out.println("Invalid response");
                } else {
                    System.out.println(a % b);
                }
                break;

            default:
                System.out.println("Invalid");
                break;
        }
        sc.close();

    }
}
