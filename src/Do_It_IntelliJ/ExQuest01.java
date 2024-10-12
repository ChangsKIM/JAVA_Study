package Do_It_IntelliJ;

import java.util.Scanner;

public class ExQuest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자 : " );
        int num1 = sc.nextInt();

        System.out.print("두번째 숫자 : ");
        int num2 = sc.nextInt();

        int sum = 0;
        sum = num1+num2;
        System.out.println("총 합 : "+sum);
    }
}
