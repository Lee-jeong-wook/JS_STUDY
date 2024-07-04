import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            if(i == 0 || i == n - 1){
                System.out.print("+");
                if(m > 2){
                    for(int j = 0; j < m - 1; j++){
                        if(j == 0 || j == m - 1){
                            System.out.print("-");
                        }
                    }
                }
                System.out.println("+");
                continue;
            }
            for(int j = 0; j < m; j++){
                if(j == 0 || j == m - 1){
                    System.out.print("|");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
