import java.util.Scanner;
import java.util.Locale;

public class peca {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1, qtd1, codigo2, qtd2;
        float valor1, valor2, total;

        codigo1 = sc.nextInt();
        qtd1 = sc.nextInt();
        valor1 = sc.nextFloat();

        codigo2 = sc.nextInt();
        qtd2 = sc.nextInt();
        valor2 = sc.nextFloat();

        total = qtd1 * valor1 + qtd2 * valor2;

        System.out.printf("Valor a pagar: R$%.2f%n", total);

        sc.close();
    }
}