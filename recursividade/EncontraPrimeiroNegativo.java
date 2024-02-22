
import java.util.Scanner;

public class EncontraPrimeiroNegativo {


public static void main(String[] args){

                Scanner sc = new Scanner(System.in);

                String[] entrada = sc.nextLine().split(" ");

                int[] entradaInt = new int[entrada.length];

                for(int i = 0; i < entrada.length; i++){
                        entradaInt[i] = Integer.parseInt(entrada[i]);
                }


		EncontraPrimeiroNegativo p = new EncontraPrimeiroNegativo();
		System.out.println(p.primeiroNegativo(entradaInt, 0));
        }



public String primeiroNegativo(int[] seq, int index){

	if(index >= seq.length ){

		return "-";


	} else {

		if(seq[index] < 0) {
		
		return Integer.toString(seq[index]);
		
		} else {
		
		return primeiroNegativo(seq, index+1);
	
	}

}


}

}
