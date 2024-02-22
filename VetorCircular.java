import java.util.Scanner;
import java.util.*;

public class VetorCircular {

        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] entrada = sc.nextLine().split(" ");
	int quantidadeElementos = sc.nextInt();

        int[] entradaInt = new int[entrada.length];

        for(int i =0; i< entrada.length; i++){
                entradaInt[i] = Integer.parseInt(entrada[i]);
        }

	VetorCircular v = new VetorCircular();
	System.out.println(v.vetor(entradaInt, quantidadeElementos));

}
	public String vetor(int[] v, int n){
	
		String saida = "";
		

		for(int i =0; i< n; i++){

			int mod =  i % v.length;

			 

			saida += Integer.toString(v[mod]) + " ";
	
		}

	return saida.trim();
	
	}	
	
	}



