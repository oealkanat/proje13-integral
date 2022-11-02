import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int degree=-1, i;
        int[] multipler;

        while (degree < 0) {
            System.out.print("What's the degree of the equation?: ");
            degree = input.nextInt();
        }
        multipler = new int[degree+1];

        System.out.println(multipler[0]);
        for (i = 0 ; i <= degree  ; i++) {
            System.out.print("What's the multipler of x^" + i + "?: ");
            multipler[i] = input.nextInt();
        }

        System.out.print("Your polynomial: ");

        for (int j=degree ; j >= 0 ; j--) {
            if (j != 0) {
                System.out.print("(" + multipler[j] + "x^" + j + ") + ");
            }
            if (j == 0) {
                System.out.print("(" + multipler[j] + "x^" + j + ")");
            }
        }

        System.out.println("Integral of your polynomial: ");

        for (i = degree ; i >= 0 ; i--) {
            multipler[i] /= i;
        }

    }
}


