package exercicios;

import java.util.HashSet;

public class intersecção {
 

	public static void main(String[] args){
	int[] p = {0, 5, 6, 9, 8};
	int[] s = {5, 3, 0, 7, 9};


	intersecção i = new intersecção();
	i.acha_inter(p, s);


	}


	public String acha_inter(int[] s, int[] q){
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < s.length; i++){
			for(int j = 0; j < q.length; j ++){
			
				
			if(s[i] == q[j]) {
                        set.add(s[i]);
                        }

			}			
		}

		System.out.println(set);

	return "";
	}



}
