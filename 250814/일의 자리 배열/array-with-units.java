import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[10];
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        
        for(int i = 0; i<8; i++){
            if((arr[i]+arr[i+1])>=10){
                arr[i+2] = (arr[i]+arr[i+1]) % 10; 
            } else {
                arr[i+2] = arr[i] + arr[i+1];
            }
        }

        for(int i = 0; i<10; i++){
            System.out.print(arr[i] + " ");
        }

        
    }
}