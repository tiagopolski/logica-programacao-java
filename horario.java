import java.util.Scanner;
import java.util.Locale;
public class horario {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int horainicio, horafinal, duracao;
        System.out.println("Que horas o jogo comecou:");
        horainicio = sc.nextInt();
        System.out.println("Que horas o jogo terminou:");
        horafinal = sc.nextInt();

        if (horainicio < horafinal){
            duracao = horafinal - horainicio;
        }
        else{
            duracao = 24 - horainicio + horafinal;
        }

        System.out.println("O jogo durou " + duracao + " Hora(s)");

        sc.close();
    }
}
