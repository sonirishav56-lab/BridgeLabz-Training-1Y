public class ArrayRotation {

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int k = 3;
        int n = arr.length;

        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

 