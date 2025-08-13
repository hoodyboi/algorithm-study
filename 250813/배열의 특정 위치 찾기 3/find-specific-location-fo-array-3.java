import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        for(int i =0; i<100; i++){
            if(sc.hasNextInt()){
                arr[i] = sc.nextInt();
            }
        }

        for(int i = 0; i<100; i++){
            if(arr[i] == 0){
                System.out.print(arr[i-3]+arr[i-2]+arr[i-1]);
                break;
            }
        }
    }
}