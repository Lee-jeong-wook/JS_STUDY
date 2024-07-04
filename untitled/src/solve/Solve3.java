package solve;

public class Solve3 {
    public static void main(String[] args) {
        int[] arr = {50, 80, 70, 10, 60, 20, 40, 30};
        for(int i = 0; i < arr.length; i++){
            int tmp = arr[i];
            int index = i;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < tmp){
                    index = j;
                    tmp = arr[j];
                }
            }
            arr[index] = arr[i];
            arr[i] = tmp;
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
