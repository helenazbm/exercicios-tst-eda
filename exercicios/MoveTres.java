package exercicios;

import java.util.Scanner;
import java.util.*;

public class MoveTres {

        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] seq = sc.nextLine().split(" ");

        int[] seqInt = new int[seq.length];

        for(int i =0; i< seq.length; i++){
                seqInt[i] = Integer.parseInt(seq[i]);
        }


	MoveTres m = new MoveTres();
	System.out.println(m.moveTres(seqInt,0));
}



	public int[] moveTres(int[] sequencia, int i){
		
		while(i <= sequencia.length){
			if(sequencia[i] > sequencia [i+1]){
                        swap (sequencia, i+1, i);
			System.out.println(Arrays.toString(sequencia));

			} else {
			
			moveTres(sequencia, i+1);
			
			}
			
		}

		return sequencia;
	}

		
	
	public void swap(int[] array, int a, int b){
		 int aux = array[a];
		 array[a] = array[b];
		 array[b] = aux;
		}
	
	}



