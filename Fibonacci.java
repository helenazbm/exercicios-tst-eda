import java.util.Scanner;


public class Fibonacci {

	public static void main (String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	int entrada = sc.nextInt();
		
	Fibonacci f = new Fibonacci();
	System.out.println(f.fibo(entrada));
	}



	public int fibo(int n){
	
	if(n == 0) { 
		return 0;
	
	} if (n == 1) {
	
		return 1;
	} 

	return fibo(n-1) + fibo(n-2);		
	
	}


}
