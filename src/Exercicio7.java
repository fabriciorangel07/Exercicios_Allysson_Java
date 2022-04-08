import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int x = input.nextInt();
        int y = 0;
        System.out.println();
        System.out.print(x);

        do {
            if (x % 2 == 0) {
                y = x / 2;
                x = y;
                System.out.print(" -> " + x);
            } else if (x % 2 != 0) {
                    x = x * 3 + 1;
                    y = x / 2;
                    System.out.print(" -> " + x);
            }
        } while (y != 1);
        
        input.close();
    }
}