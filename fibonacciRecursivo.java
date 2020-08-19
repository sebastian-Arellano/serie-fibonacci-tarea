package fibonacciRecursivo;

public class fibonacciRecursivo {

		public int fibonacciRecursivo ( int n) {
     
		if (n==1 || n==2) {
			//caso base 
			return 1;
		}else {
			//dominio (problema-1)
			return fibonacciRecursivo(n-1) + fibonacciRecursivo(n-2);
		}
		
	}
}
