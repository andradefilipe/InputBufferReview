import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        sc.nextLine();
        for (int i=0; i<=num; ++i){
            String line = sc.nextLine();
            String even = new String();
            String odd = new String();
            int counter =0;
            for(char c : line.toCharArray()) {
                if(counter %2 ==0){
                    even = even + c;
                }
                else{
                    odd = odd + c;
                }
                ++counter;
            }
            System.out.print(even + " " + odd + "\n" );
        }
        sc.close();
    }
}