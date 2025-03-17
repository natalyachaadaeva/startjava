import java.util.Arrays;

public class Reverser {
    public static void main(String[] args) {
        int[] nums1 = {};
        int[] reversed = reverse(nums1);
        printResult(nums1, reversed);

        int[] nums2 = null;
        reversed = reverse(nums2);
        printResult(nums2, reversed);

        int[] nums3 = {6, 8, 9, 1};
        reversed = reverse(nums3);
        printResult(nums3, reversed);

        int[] nums4 = {13, 8, 5, 3, 2, 1, 1};
        reversed = reverse(nums4);
        printResult(nums4, reversed);
    }

    private static int[] reverse(int[] arr) {
        if (arr == null) {
            return null;
        }

        int[] reversedArray = new int[arr.length];
        int i = arr.length - 1;
        for (int value : arr) {   // цикл for-each для перебора элементов массива вместо for
            reversedArray[i] = value;
            i--;
        }
        return reversedArray;
    }

    private static void printResult(int[] original, int[] reversed) {
        if (original == null) {
            System.out.println("Array is null");
            return;
        }

        System.out.print("До реверса: ");
        printArray(original);

        System.out.print("После реверса: ");
        printArray(reversed);

        System.out.println();
    }

    private static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
}