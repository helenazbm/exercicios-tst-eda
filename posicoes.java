import java.util.*;
import java.util.Scanner;


public class posicoes {

	public static void main (String[] args){

	   Scanner sc = new Scanner(System.in);

	   int numero = sc.nextInt();
	   sc.nextLine();
	   String[] sequencia = sc.nextLine().split(" ");

	   int[] seqInt = new int[sequencia.length];

	   for(int i = 0; i < seqInt.length; i++){
	   	seqInt[i] = Integer.parseInt(sequencia[i]);
	   }

	   posicoes p = new posicoes();
	   System.out.println(p.seq(seqInt, numero));
	   
	   }
	
	
	   public String seq(int[] sequencia, int elemento){
	   	String saida = "";

	       for (int i = 0; i < sequencia.length; i++){
	           if(sequencia[i] == elemento){
		    saida += " " + Integer.toString(i);

	       }

	       }

	      if (saida == ""){
                saida = "-1";
	      }

	   return saida.trim();
	   
	}

}


