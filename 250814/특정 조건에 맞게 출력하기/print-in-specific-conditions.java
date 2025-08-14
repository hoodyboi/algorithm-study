import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        while(sc.hasNextInt()){
            int val = sc.nextInt();
            if(val == 0){
                break;
            }
            if(val % 2 == 1){
                System.out.print(val+3 + " ");
            } else {
                System.out.print(val/2 + " ");
            }
        }
    }
}