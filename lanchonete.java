import java.util.Scanner;
import java.util.Locale;
public class lanchonete {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, qtd;
        double total = 0.0;
        System.out.println("Digite o codigo: ");
        codigo = sc.nextInt();
        System.out.println("Digite a quantidade deste codigo: ");
        qtd = sc.nextInt();

        if (codigo == 1){   
            total = qtd * 4.0;
        }
        else if (codigo == 2){   
            total = qtd * 4.5;
        }
        else if (codigo == 3){   
            total = qtd * 5.0;
        }
        else if (codigo == 4){   
            total = qtd * 2.0;
        }
        else if (codigo == 5){   
            total = qtd * 1.5;
        }

        System.out.printf("Total a pagar: R$ %.2f%n", total);

        sc.close();
    }
}