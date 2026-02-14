/* 
Consider a sequence u where u is defined as follows:
1. The number u(0) = 1 is the first one in u.
2. For each x in u, then y = 2 * x + 1 and z = 3 * x + 1 must be in u too.
3. There are no other numbers in u.
Ex: u = [1, 3, 4, 7, 9, 10, 13, 15, 19, 21, 22, 27, ...]
1 gives 3 and 4, then 3 gives 7 and 10, 4 gives 9 and 13, then 7 gives 15 and 22 and so on...

Task:
Given parameter n the function dbl_linear (or dbLinear...) returns the element u(n) of the ordered (with<)
sequence u (so, there are no duplicates).
*/

import java.util.*;

public class DoubleLinear {
    public static int dbLinear (int n) {
    List<Integer> u = new ArrayList<Integer>();
        u.add(1);
        int i = 0, j = 0;
        while (u.size() <= n) {
            int y = 2 * u.get(i) + 1;
            int z = 3 * u.get(j) + 1;
            if (y <= z) {
                    u.add(y);
                    i++;
                    if (y == z) {
                            j++;
                    }
            } else {
                u.add(z);
                j++;
            }
        }
        return u.get(n);
    }

    public static void main(String[] args) {
        System.out.println(dbLinear(10)); // should print 22
    }
}