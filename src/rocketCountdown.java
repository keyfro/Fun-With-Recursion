public class rocketCountdown {
	public static void main(String[] args) {
		System.out.println("Keyanna Frost, CIS319, Unit 5 Guided Practice 1\n");

		System.out.println("Rocket Countdown:");
		rocketCountdown(10);
		System.out.println();
		
		System.out.println("Factorial:");
		computeFactorial(5);
		System.out.println();
	} 
	
	private static void rocketCountdown(int num) {
		System.out.print("Using Iteration: ");
		iterativeCountdown(num);
		System.out.println("Blast Off!");
		
		System.out.print("Using Recursion: ");
		recursiveCountdown(num);
		System.out.println("Blast Off!");
	} // end method rocketCountdown

	private static void computeFactorial(int i) {
		System.out.print("Using Iteration: ");
		System.out.println(iterativeFactorial(i));
		
		System.out.print("Using Head Recursion: ");
		System.out.println(headRecursiveFactorial(i));
		
		System.out.print("Using Tail Recursion: ");
		System.out.println(tailRecursiveFactorial(i));
	} // end method computeFactorial

	private static long tailRecursiveFactorial(int i) {
		long factorial = 1;
		return tailHelperRecursiveFactorial(i, factorial);
	} // end method tailRecursiveFactorial

	private static long tailHelperRecursiveFactorial(int currentNum, long factorialSoFar) {
		if(currentNum == 0)
			return factorialSoFar;
		else
			return tailHelperRecursiveFactorial(currentNum - 1, factorialSoFar * currentNum);
	} // end method tailHelperRecursiveFactorial

	private static long headRecursiveFactorial(int i) {
		if((i == 0) || (i == 1))	
			return 1;
		else
			return headRecursiveFactorial(i - 1 ) * i;
		
	} // end method headRecursiveFactorial

	private static long iterativeFactorial(int i) {
		long factorial = 1;
		for(; i > 1; i--) {
			factorial *= i;
		}//end for
		return factorial;
	}//end method iterativeFactorial

	private static void iterativeCountdown(int num) {
		for(; num > 0; num--)
		{
			System.out.print(num);
			System.out.print(" ");
		}
	} // end method iterativeCountdown

	private static void recursiveCountdown(int num) {
		System.out.print(num);
		System.out.print(" ");
		if(num > 1)
			recursiveCountdown(num - 1);
	} // end method recursiveCountdown
} // end class