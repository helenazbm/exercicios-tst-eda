import java.util.Scanner;
import java.util.*;

public class BuscaLinearRecursiva{


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String[] entrada = sc.nextLine().split(" ");
		int chave = sc.nextInt();

		int[] entradaInt = new int[entrada.length];

		for(int i = 0; i < entrada.length; i++){
			entradaInt[i] = Integer.parseInt(entrada[i]);
		}

		BuscaLinearRecursiva r = new BuscaLinearRecursiva();
		System.out.println(r.buscaRecursiva(entradaInt, chave, 0));
	}


	public int buscaRecursiva(int[] seq, int chave, int index) {

	if(index >= seq.length){
		return -1;
	} else {
		
		if(seq[index] == chave){
			return index;
		} else {
			return buscaRecursiva(seq, chave, index +1);
		}
	
	}
}


}

