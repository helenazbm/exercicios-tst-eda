package exercicios;

import java.util.Scanner;


public class quebraR {


	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	String[] input = sc.nextLine().split(" ");

	int[] entrada = new int[input.length];

	for(int i =0; i < input.length; i++) {
	
		entrada[i] = Integer.parseInt(input[i]);
	}
	
	
	quebraR r = new quebraR();
	System.out.println(r.recursivo(entrada, 0));
	
	}

	

    public int recursivo(int[] sequencia, int index) {
        if (index >= sequencia.length - 1) {
            if (sequencia[index + 1] < sequencia[index]) {
                return index + 1;
            }
        } else {
            if (sequencia[index + 1] < sequencia[index]) {
                return index + 1;
            } else {
                return recursivo(sequencia, index + 1);
            }
        }

        return -1;
    }
}
