import java.util.Scanner;
import java.util.Locale;
public class eixo {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x, y;
        System.out.println("Digite um valor para X :");
        x = sc.nextDouble();
        System.out.println("Digite um valor para Y :");
        y = sc.nextDouble();

        if (x == 0 && y == 0){
            System.out.printf("Origem");
        }
        else if(x > 0 && y > 0){
            System.out.printf("Quadrante 1");
        }
        else if(x < 0 && y > 0){
            System.out.printf("Quadrante 2");
        }
        else if(x < 0 && y < 0){
            System.out.printf("Quadrante 3");
        }
        else{
            System.out.printf("Quadrante 4");
        }

        sc.close();
    }
}
