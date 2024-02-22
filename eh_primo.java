public class eh_primo{

	public static void main(String[] args){

		int numero = 2;

	eh_primo p = new eh_primo();
	System.out.println(p.e_primo(numero));
}

	public boolean e_primo(int n){


		if (n <= 1){

			return false;
		}

		for(int i = 2; i <= Math.sqrt(n); i++){
			if(n % i == 0){
		            return false;
				}

			}
	return true;
		}	
	
	}


