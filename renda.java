import java.util.Scanner;
import java.util.Locale;
public class renda {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, imposto;
        System.out.println("Digite o salario:");
        salario = sc.nextDouble();

        if(salario <= 2000){
            imposto = 0.0;
            System.out.printf("Isento de Imposto");
        }
        else if(salario <= 3000){
            imposto = (salario - 2000.0) * 0.08;
            System.out.printf("Imposto de R$%.2f", imposto);
        }
        else if(salario <= 4500){
            imposto = (salario - 3000) * 0.18 + 1000 * 0.08;
            System.out.printf("Imposto de R$%.2f", imposto);
        }
        else{
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000 * 0.08;
            System.out.printf("Imposto de R$%.2f", imposto);
        }

        sc.close();
    }
}
