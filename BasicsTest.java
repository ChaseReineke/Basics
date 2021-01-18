import java.util.Arrays;

public class BasicsTest {
    public static void main(String[] args) {
        Basics bj = new Basics();

        bj.printNumbers();

        bj.printOddNumbers();

        bj.printSum();

        int[] arr1 = {1, 3, 5, 7, 9, 13};
        bj.iterateArray(arr1);

        bj.findMax(arr1);

        bj.findAvg(arr1);

        bj.oddArray();

        System.out.println(bj.greaterThan(arr1, 3));

        bj.square(arr1);

        int[] arr2 = {3, -5, 5, 2, -6, 4};
        bj.eliminateNegative(arr2);

        System.out.println(Arrays.toString(bj.maxMinAvg(arr1)));

        bj.shiftArray(arr1);
    }
}
