package exercicios;

public class palindromos {
	

	public static void main(String[] args){
	
		char[] seq = {'h', 'e', 'l', 'e', 'n', 'a'};
		char[] seq2 = {'r', 'e', 'v', 'i', 'v', 'e', 'r'};
		palindromos p = new palindromos();
		System.out.println(p.eh_palindromo(seq));

	}


	public boolean eh_palindromo(char[] palavra){
	int contador = palavra.length - 1;
	boolean saida = false;
		for(int i =0; i< (palavra.length) / 2; i++){
			if(palavra[i] == palavra[contador]){
			contador += -1;
			saida = true;
			}else{
			saida = false;
			contador += -1;
			}
	}

	return saida;
}

}
