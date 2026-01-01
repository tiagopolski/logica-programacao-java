import java.util.Scanner;
import java.util.Locale;

public class diferenca {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();
        diferenca = (A * B - C * D);

        System.out.printf("Diferenca de produto: %d", diferenca);

        sc.close();
    }
}