public class temRepetido{


	public static void main(String[] args){
	int[] seq = {1, 13, 3, 4, 5, 1};
	int[] seq2 = {1, 13, 3, 4, 5, 2};
	
	temRepetido t = new temRepetido();
	System.out.println(t.tem_repetido(seq2));
	}


	public boolean tem_repetido(int[] v){
	
		for(int i = 0; i < v.length; i++){
			for (int j = i +1; j < v.length; j++){
			
				if(v[i] == v[j]){
				return true;
			}
		
		}
	
	}

	return false;

}

}
