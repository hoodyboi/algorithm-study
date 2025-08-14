import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 0;
        int cnt = 0;
        while(cnt < 2){
            i++;
            int val = n * i;
            System.out.print(val + " ");
            if(val % 5 == 0){
                cnt++;
            }
        }
    }
}