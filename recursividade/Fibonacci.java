import java.util.Scanner;


public class Fibonacci{

	

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Fibonacci f = new Fibonacci();
		System.out.println(f.fibonacciRecursivo(n));
	
	
	}


	public int fibonacciRecursivo(int n){
	
		if(n <= 1){
		    return n;

		}
		
		    return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);


}



}
