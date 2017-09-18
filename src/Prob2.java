/*
PROBLEM: Even Fibonacci Numbers.
 */
public class Prob2 {
    
    // Gets the nth fibonacci number.
    public static int fibonacci(int n) {
        
        return (n <= 1) ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        int n = 0, sum = 0;

        while(fibonacci(n++) <= 4000000)
            sum += (fibonacci(n) % 2 == 0) ? fibonacci(n) : 0;

        System.out.println(sum);

    }
}
