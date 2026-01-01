import java.util.Scanner;
import java.util.Locale;
public class Dia {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        String dia;

        System.out.println("Digite o dia da semana:");
        x = sc.nextInt();

        switch (x){
            case 1:
                dia = "Domingo";
                break;
            case 2:
                dia = "Segunda";
                break;
            case 3:
                dia = "Terca";
                break;
            case 4:
                dia = "Quarta";
                break;
            case 5:
                dia = "Quinta";
                break;
            case 6:
                dia = "Sexta";
                break;
            case 7:
                dia = "Sabado";
                break;
            default:
                dia = "Valor invalido";
                break;
        }

        System.out.printf("Dia da semana: %s", dia);

        sc.close();
    }
}
