package solve;

public class Solve2 {
    public static void main(String[] args) {
        int[] arr = {12, 25, 31, 46, 54, 66, 80, 83, 95, 100};
        System.out.println(BinarySearch(arr, 25));
    }
    public static int BinarySearch(int[] arr, int target){
        int index = arr.length / 2;
        int num = arr[index];
        int end = arr.length;
        int start = 0;
        while(num != target){
            if(target < arr[index]){
                end = index;
            } else if(target > arr[index]) {
                start = index;
            }
            index = (end + start) / 2;
            num = arr[index];
            if(end - 1 == start && target != arr[index]){
                return -1;
            }
        }
        return index;
    }
}
