import java.util.Scanner;
import java.util.Locale;
public class ternaria {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double preco, total;
        System.out.println("Digite o preco: ");
        preco = sc.nextDouble();

        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        //SINTAXE : (condição) ? valor_verdadeiro : valor_falso --> TROCA DO IF ELSE

        total = preco - desconto;
        System.out.printf("Desconto de: R$%.2f%n", desconto);
        System.out.printf("Preco com desconto: R$%.2f", total);
        sc.close();
    }
}

