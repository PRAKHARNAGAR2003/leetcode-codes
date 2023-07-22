// Problem-7

import java.util.Scanner;
class reverse_num{
    public static void main(String []args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int r;
        int sum = 0;
        while(num>0){
            r = num%10;
            sum = sum*10+r;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
