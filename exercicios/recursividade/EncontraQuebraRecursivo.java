import java.util.Scanner;

public class EncontraQuebraRecursivo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                String[] entrada = sc.nextLine().split(" ");

                int[] entradaInt = new int[entrada.length];

                for(int i = 0; i < entrada.length; i++){
                        entradaInt[i] = Integer.parseInt(entrada[i]);
                }

		EncontraQuebraRecursivo e = new EncontraQuebraRecursivo();
		System.out.println(e.encontraQuebra(entradaInt, 0));

        }

	public int encontraQuebra(int[] seq, int index){
	
		if(index >= seq.length - 1){
			return -1;
		} else {
			if(seq[index] > seq[index+1]){
				return index+1;
			} else {
				return encontraQuebra(seq, index+1);
			
			
			}
		
		}
	
	}
}
