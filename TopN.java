import java.util.Scanner;
import java.util.*;

public class TopN {

        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
	String[] seq = sc.nextLine().split(" ");
	
	int n = sc.nextInt();

        int[] seqInt = new int[seq.length];

        for(int i =0; i< seq.length; i++){
                seqInt[i] = Integer.parseInt(seq[i]);
        }


	TopN t = new TopN();
	t.maioresElementos(seqInt, n);

	}



	public void maioresElementos(int[] seqInt, int n){
	
		for(int i =0; i<n; i++){
			int maxIndice = i;

			for(int j = i+1; j < seqInt.length; i++){
				if(seqInt[j] > seqInt[maxIndice]);
					maxIndice = j;
			
			
			}



		int aux = seqInt[i];
		seqInt[i] = seqInt[maxIndice];
		seqInt[maxIndice] = aux;

	}

	for(int i =0; i< n; i++){
		System.out.print(seqInt[i] + " ");
	}
}

}


