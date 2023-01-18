
public class TiposPrimitivos {
    

    public static void main(String[] args) {
        
        // Numericos inteiros
        
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 1_324_845_223L; // L associada para dizer que é um literal LONG

        //Flutuantes
        float salario = 11_554.222F; // F associada que é um literal Float
        double vendasAcumuladas = 2_454.545;

        //Booleano
        boolean estaDeFerias = true;

        //Caractere
        char status = 'A';
        

        // Dias de empresa
        System.out.println((anosDeEmpresa * 365));

        //Numero de viagens
        System.out.println(numeroDeVoos/ 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + "ganha" + salario);
        System.out.println("ferias" + estaDeFerias);
        System.out.println("Advertencia" + status);
    }
}
