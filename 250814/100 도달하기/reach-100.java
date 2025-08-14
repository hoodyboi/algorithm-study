import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[100];
        arr[0] = 1;
        arr[1] = n;
        System.out.print(arr[0] + " " + arr[1] +" ");
        for(int i = 0; i<100; i++){
            if(arr[i+1] < 100){
                arr[i+2] = arr[i+1] + arr[i];
                System.out.print(arr[i+2] + " " );
            } else {
                break;
            }
        }
        
    }
}