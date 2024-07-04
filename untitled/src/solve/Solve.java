package solve;

public class Solve {
    public static void main(String[] args) {
        int[] arr = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};
        int min = arr[0];
        int minIdx = 0;
        int max = 0;
        int maxIdx = 0;
        for(int i = 0; i < arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
                minIdx = i;
            }
            if(max<arr[i]){
                max = arr[i];
                maxIdx = i;
            }
        }
        System.out.printf("min = %d idx = %d, max = %d idx = %d", min, minIdx, max, maxIdx);
    }
}
