package sortAlgorithm;

public class binarySearch {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 7};
        int x = binarySearchIm(a, 9);

        System.out.println(x);
    }

    public static int binarySearchIm(int[] x, int key) {
        int low = 0;
        int high = x.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (key == x[mid]) {
                return mid;
            } else if (key > x[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return -1;
    }
}
