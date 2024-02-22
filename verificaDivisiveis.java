public class verificaDivisiveis{



	public static void main(String[] args){
	
		int[] seq = {5, 13, 3, 4, 8};
		int[] seq2 = {5, 13, 3, 4, 7};


		verificaDivisiveis v = new verificaDivisiveis();
		System.out.println(v.verifica_divisiveis(seq));

	}


	public boolean verifica_divisiveis(int[] v){
	
		
		for(int i = 0; i< v.length - 1; i++){
			if(v[i+1] % v[i] == 0){
				return true;
		}

		}

		return false;
	}

}

