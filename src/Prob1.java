import java.util.stream.IntStream;

/*
PROBLEM: Multiples of 3 and 5.
 */

public class Prob1 {

    public static void main(String[] args) {

        System.out.println(IntStream.range(3, 1000).filter(x -> (x % 3 == 0) || (x % 5 == 0)).sum());
    }
}
