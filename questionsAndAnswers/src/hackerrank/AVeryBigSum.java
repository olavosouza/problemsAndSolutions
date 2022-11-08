package hackerrank;

import java.util.List;
/*
Function Description

        Complete the aVeryBigSum function in the editor below. It must return the sum of all array elements.

        aVeryBigSum has the following parameter(s):

        int ar[n]: an array of integers .
        Return

        long: the sum of all array elements
        Input Format

        The first line of the input consists of an integer .
        The next line contains  space-separated integers contained in the array.

        Output Format

        Return the integer sum of the elements in the array.

        Constraints


        Sample Input

        5
        1000000001 1000000002 1000000003 1000000004 1000000005
        Output

        5000000015*/

public class AVeryBigSum {

    public static void main(String[] args) {
        System.out.println(aVeryBigSum(List.of(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L)));
    }

    public static long aVeryBigSum(List<Long> ar) {

        return ar.stream().reduce(0L, (a, b) -> a + b);

    }
}
