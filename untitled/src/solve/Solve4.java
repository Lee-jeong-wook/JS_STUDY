package solve;

public class Solve4 {
    public static void main(String[] args) {
        int[] arr = {12, 25, 31, 46, 54, 66, 80, 83, 95, 100};
        int i = 0;
        int j = 0;

        for (i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int index = i - 1;

            while ((index >= 0) && (arr[index] > tmp)){
                arr[index + i] = tmp;
                index--;
            }
            arr[index + 1] = tmp;
        }
        for(int num : arr){
            System.out.println(num + " ");
        }
    }
}
