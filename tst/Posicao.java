import java.util.*;
import java.util.Scanner;

public class Posicao{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	int n = sc.nextInt();
	sc.nextLine();

	String[] seq = sc.nextLine().split(" ");
	
	String saida = "";
	for(int i = 0; i < seq.length; i++) {
		if(Integer.parseInt(seq[i]) == n){
			saida += Integer.toString(i) + " ";
			
		} 
		
	}

	if(saida == ""){
		saida = "-1";
	}

	System.out.println(saida.trim());
}

}
