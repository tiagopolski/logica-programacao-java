import java.util.Scanner;
import java.util.Locale;
public class intervalo {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double valor;
        System.out.println("Digite um valor:");
        valor = sc.nextDouble();

        if(valor >= 0 && valor <= 25){
            System.out.printf("Intervalo de [0,25]");
        }
        else if(valor > 25 && valor <= 50){
            System.out.printf("Intervalo de (25,50]");
        }
        else if(valor > 50 && valor <=75){
            System.out.printf("Intervalo de (50,75]");
        }
        else if(valor > 75 && valor <= 100){
            System.out.printf("Intervalo de (75,100]");
        }
        else{
            System.out.printf("Valor fora do intervalo!");
        }

        sc.close();
    }
}
