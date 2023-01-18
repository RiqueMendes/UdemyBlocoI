import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class PrintRandom {


    
    public static void main(String[] args) {

        
        List<Integer> lista = Arrays.asList(1 , 2 , 3 , 4 ,5 , 6 , 7 ,8 , 9 , 10 , 11 , 12 , 13 , 14 , 15 , 16 , 17 , 18 , 19 , 20 , 21 , 22 , 23 , 24 , 25);
        
        
        Collections.shuffle(lista);
        System.out.println(lista);
        
     

      /*   Random random = new Random();
        random.nextInt();

        int numerosA = 0;
        for (numerosA = 0; numerosA <= 15; numerosA++) {

            System.out.println(numerosA);

        } */
    }
}
