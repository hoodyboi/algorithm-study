import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i<10; i++){
            arr[i] = sc.nextInt();
            if(i % 2 == 1){
                sum += arr[i];
            }
        }
        sum2 = arr[2] + arr[5] + arr[8];
        System.out.printf("%d %.1f", sum, (float)sum2/3);
    }
}