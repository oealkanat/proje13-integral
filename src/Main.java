import java.util.Scanner;

public class Main {
    static void polyPrinter(float[] coEf, int degree) {
        power powSym = new power();

        for (int j=degree ; j >= 0 ; j--) {
            if(coEf[j]!=0) {
                if (coEf[j] > 0 && j!=degree) {
                    System.out.print("+");
                }

                if(coEf[j]%((int)coEf[j])==0) {
                    System.out.print((int)coEf[j]);
                }
                if(coEf[j]%((int)coEf[j])!=0) {
                    System.out.print(coEf[j]);
                }

                if (j!=0) {
                    System.out.print("x");
                    if (j!=1) {
                        System.out.print(powSym.myPow(j));
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        power powSym = new power();
        Scanner input = new Scanner(System.in);
        int degree=-1, degreeInt=-1;
        float[] coEf;
        float[] coEfInt;
        float[] coEfDer;

        while (degree <= 0 || degree > 9) {
            System.out.print("Enter the degree of the polynomial (1-9): ");
            degree = input.nextInt();
        }
        degreeInt = degree;
        coEf = new float[degree+1];
        coEfInt = new float[degree+2];
        coEfDer = new float[degree+1];

        for (int i = degree ; i >= 0  ; i--) {
            if(i==0) {
                System.out.print("Enter the constant (coefficient of x\u2070): ");
            }
            if(i==1) {
                System.out.print("Enter the coefficient of x: ");
            }
            if(i!=0 && i!=1) {
                System.out.print("Enter the coefficient of x" + powSym.myPow(i) + ": ");
            }

            coEf[i] = input.nextInt();
        }

        System.out.print("\nYour polynomial: ");

        polyPrinter(coEf, degree);

        for (int i=degree ; i>=0 ; i--) {
            coEfInt[i+1] = coEf[i]/(i+1);
        }

        System.out.print("\nIntegral of your polynomial: ");
        polyPrinter(coEfInt, degree+1);
        System.out.println("+c");


        for (int i=0 ; i<=degree-1 ; i++) {
            coEfDer[i] = coEf[i+1]*(i+1);
        }

        System.out.print("Derivative of your polynomial: ");
        polyPrinter(coEfDer, degree);
    }
}