package Do_It_IntelliJ;

import java.util.Scanner;

public class ExQuest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력 : ");
        int number = sc.nextInt();

        int sum = 0;
        while(number != 0){
            sum += number % 10;
            number /= 10;
        }
        System.out.println(sum);

    }
}
