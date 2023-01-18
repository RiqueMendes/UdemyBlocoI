public class SwitchSemBreak {
    
    public static void main(String[] args) {
        
        String faixa = "preta";        
        switch(faixa.toLowerCase()){
            case "preta":
                System.out.println("Faixa preta...");
                break;
            case "marrom":
                System.out.println("Faixa marrom...");
                break;
            case "verde":
                System.out.println("Faixa verde...");
                break;

            default:
            System.out.println("Nenhuma faixa");
            break;
        }  
        System.out.println("FIM");
    }
}
