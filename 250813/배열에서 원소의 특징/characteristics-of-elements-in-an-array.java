import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[100];

        int findtriple = 0;
        int cnt = 0;
        for(int i = 0; i<100; i++){
            if(sc.hasNextInt()){
                arr[i] = sc.nextInt();
                cnt++;
            }
        }

        for(int i =0; i<cnt; i++){
            if(arr[i] % 3 == 0){
                findtriple = i;
                break;
            }
        }
        System.out.print(arr[findtriple-1]);
    }
}