package exercicios;

import java.util.*;

public class SomaDois{



	public static void main(String[] args){
	   
		int[] input = {1, 2, 13, 0, 4, 5};
		int target = 20;
		
		SomaDois s = new SomaDois();
		System.out.println(Arrays.toString(s.two_sum(input, target)));

	
	
	
	}

	public int[] two_sum(int[] v, int target){
	int[] posicoes = new int[2];

	for(int i =0; i< v.length; i++){
		for (int j = i+1; j< v.length; j++){
		
			if(v[i] + v[j] == target){
			posicoes[0] = v[i];
			posicoes[1] = v[j];
			return posicoes;
			}
			
		}
	}
	
	return new int[0];
	}
}
