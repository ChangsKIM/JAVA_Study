import java.util.Scanner;

public class EXQuset02 {
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
