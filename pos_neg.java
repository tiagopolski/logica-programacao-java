import java.util.Scanner;
import java.util.Locale;
public class pos_neg {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        if (num > 0){
            System.out.println("Positivo");
        }
        else{
            System.out.println("Negativo");
        }

        sc.close();
    }
}