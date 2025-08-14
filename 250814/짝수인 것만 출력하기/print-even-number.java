import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            if(sc.hasNextInt()){
                int getValue = sc.nextInt();
                if(getValue% 2 == 0){
                    System.out.print(getValue + " ");
                }
            }
        }
    }
}