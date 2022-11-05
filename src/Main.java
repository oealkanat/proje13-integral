import java.util.Scanner;

public class Main {
    static void polyPrinter(int[] multipler, int degree) {
        power powSym = new power();
        for (int j=degree ; j >= 0 ; j--) {
            if(multipler[j]!=0) {
                if (multipler[j] > 0 && j!=degree) {
                    System.out.print("+");
                }
                System.out.print(multipler[j]);
                if (j!=0) {
                    System.out.print("x" + powSym.myPow(j));
                }
            }
        }
    }
    public static void main(String[] args) {
        power powSym = new power();
        Scanner input = new Scanner(System.in);
        int degree=-1, i;
        int[] multipler;

        while (degree < 0 || degree > 10) {
            System.out.print("Enter the degree of the polynomial: ");
            degree = input.nextInt();
        }
        multipler = new int[degree+1];

        for (i = degree ; i >= 0  ; i--) {
            if(i==0) {
                System.out.print("Enter the constant (coefficient of x\u2070): ");
            }
            if(i==1) {
                System.out.print("Enter the coefficient of x: ");
            }
            if(i!=0 && i!=1) {
                System.out.print("Enter the coefficient of x" + powSym.myPow(i) + ": ");
            }

            multipler[i] = input.nextInt();
        }

        System.out.print("Your polynomial: ");

        polyPrinter(multipler, degree);
    }
}


