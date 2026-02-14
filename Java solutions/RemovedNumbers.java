/*
- A friend of mine takes the sequence of all numbers from 1 to n (where n>0)
- within that sequence, he chooses two numbers, a and b
- he says that the product of a and b should be equal to the sum of all numbers in the sequence, excluding a and b
- given a number n, could you tell me the numbers he excluded from the sequence?

The function takes the parameter: n(n is always strictly greater than 0) and returns an array or a string (depending on the 
language) of the form:
[(a, b), ...] or [[a, b], ...] or {{a, b}, ...} or or [(a, b}, ...]

with all (a, b) which are the possible removed numbers in the sequence 1 to n.
[(a, b), ...] or [[a, b], ...] or {{a, b}, ...} or ... will be sorted in increasing order of the "a".

It happens that there are several possible (a, b). The function returns an empty array (or an empty string) if no possible
numbers are found which will prove that my friends has not told the truth! (Go: in this case return nil)
*/

import java.util.*;

public class RemovedNumbers {
    public static List<long[]> removNb(long n) {
        long sum = n * (n + 1) / 2;
        List<long[]> result = new ArrayList<>();
        for (long a = 1; a <= n; a++) {
            long b = (sum - a) / (a + 1);
            if (b <= n && a * b == sum - a - b) {
                result.add(new long[]{a, b});
            }
        }
        return result;  
    }
}