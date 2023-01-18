import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe a média ");
        double media = entrada.nextDouble();

        if (media > 7) {
            System.out.println("aprovado");
        } else {
            System.out.println("reprovado");
        }
    }
}
