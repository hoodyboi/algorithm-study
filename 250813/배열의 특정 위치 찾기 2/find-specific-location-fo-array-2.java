import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int oddvaluesum = 0;
        int evenvaluesum = 0;
        for(int i = 0; i<10; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<10; i++){
            if(i % 2 == 1){
                evenvaluesum+=arr[i];
            }
            if(i % 2== 0){
                oddvaluesum+=arr[i];
            }
        }
        if(evenvaluesum>oddvaluesum){
            System.out.print(evenvaluesum - oddvaluesum);
        } else {
            System.out.print(oddvaluesum-evenvaluesum);
        }
    }
}