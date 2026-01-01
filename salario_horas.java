import java.util.Scanner;
import java.util.Locale;

public class SalarioHoras {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, horas;
        double valor_h, salario;

        n = sc.nextInt();
        horas = sc.nextInt();
        valor_h = sc.nextDouble();
        salario = horas * valor_h;

        System.out.printf("Numero = %d%n", n);
        System.out.printf("Salario = %.2f%n", salario);

        sc.close();

    }
}
