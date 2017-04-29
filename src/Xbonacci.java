import java.util.Arrays;

/**
 * Created by Julian on 30/04/2017.
 */
public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        // hackonacci me
        //Initialise array structure of size 'n' as a copy of the signature with additional length
        double[] tribonacciArray = Arrays.copyOf(s, n);

        //Loop through array and sum previous entries 'x' times where 'x' = length of signature
        for (int i = s.length; i < tribonacciArray.length; i++) {
            for (int j = 0; j < s.length; j++) {
                tribonacciArray[i] += tribonacciArray[i - (j + 1)];
            }
        }
        return tribonacciArray;
    }

    public static void main(String[] args) {
        Xbonacci test = new Xbonacci();
        double[] testCase1 = {1.0, 1.0, 1.0};
        double [] ans1;
        double[] testCase2 = {0.0, 1.0, 1.0};
        double[] ans2;
        double[] testCase3 = {};
        double[] ans3;
        double[] testCase4 = {0.0, 1.0};
        double[] ans4;
        double[] ans5;

        ans1 = test.tribonacci(testCase1, 10);
        ans2 = test.tribonacci(testCase2, 10);
        ans3 = test.tribonacci(testCase3, 0);
        ans4 = test.tribonacci(testCase4, 10);
        ans5 = test.tribonacci(testCase1, 0);

        System.out.println(Arrays.toString(ans1));
        System.out.println(Arrays.toString(ans2));
        System.out.println(Arrays.toString(ans3));
        System.out.println(Arrays.toString(ans4));
        System.out.println(Arrays.toString(ans5));
    }
}
