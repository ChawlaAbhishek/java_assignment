package unit5_c2_q1;

public class SearchingRunner {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2}; //unsorted array
        int target = 3;
        BinarySearch bs1 = new BinarySearch( /*use bubble sort algorithm*/);
        bs1.binarySearch(arr, target);
        BinarySearch bs2 = new BinarySearch( /*use selection sort algorithm*/);
        bs2.binarySearch(arr, target);
        BinarySearch bs3 = new BinarySearch( /*use another algorithm*/);
        bs3.binarySearch(arr, target);
    }
}
