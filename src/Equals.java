import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        
        System.out.println("2" == "2");

        String s = new String("2");

        System.out.println("2" == s);

        System.out.println("2".equals(s));

        Scanner entrada = new Scanner(System.in);

        String s1 = entrada.next();
        System.out.println("2".equals(s1.trim())); //Equals compara conteúdo
        entrada.close();
    }
}
