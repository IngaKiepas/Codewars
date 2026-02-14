/*
In this kata you have to correctly return who is the "survivor", ie: the last elemenf of a Josephus permutation.
!Josephus permutation: http://www.codewars.com/kata/josephus-permutation/

Basically you have to assume that n people are put into a circle and that they are eliminated in steps of k elements,
like this:
n=7, k=3 => means 7 people in a circle
one every 3 i eliminated until one remains
[1,2,3,4,5,6,7] - initial sequence
[1,2,4,5,6,7] => 3 is counted out
[1,2,4,5,7] => 6 is counted out
[1,4,5,7] => 2 is counted out
[1,4,5] => 7 is counted out
[1,4] => 5 is counted out
[4] => 1 counted out, 4 is the last element - the survivor!
*/

import java.util.*;

public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
        List<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        int index = 0;
        while (list.size() > 1) {
            index = (index + k - 1) % list.size();
            list.remove(index);
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        int survivor1 = josephusSurvivor(7, 3);
        System.out.println("Survivor for n=7, k=3: " + survivor1); //oczekiwane 4

        int survivor2 = josephusSurvivor(10, 2);
        System.out.println("Survivor for n=10, k=2: " + survivor2); //oczekiwane 5
    }
}