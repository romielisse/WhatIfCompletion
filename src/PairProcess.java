import java.util.Scanner;

public class PairProcess {
    public static void main(String[] args) {
        int num1, num2, sum;
        String suffix = "";

        Scanner keyboard = new Scanner(System.in);

        System.out.print( "First Number? :" );
        num1 = keyboard.nextInt();

        System.out.print( "Last Number?  :" );
        num2 = keyboard.nextInt();

        sum = num1 + num2;

        if(sum > 200){
            suffix += "*";
        }

        if(sum < 1000) {
            suffix += "~";
        }

        System.out.println("Sum: " + sum + suffix);
    }
}