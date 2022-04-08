public class Exercicio5 {
    public static void main(String[] args) {
        for (long n = 1, fatorial = 1; n <= 20; n++){
            fatorial = fatorial * n;
            System.out.println("O fatorial de " + n + " é: " + fatorial);
        }
        
        System.out.println();
        System.out.println("############## Separação ###############");
        System.out.println();

        for (long n = 1, fatorial = 1; n <= 30; n++){
            fatorial = fatorial * n;
            System.out.println("O fatorial de " + n + " é: " + fatorial);
        }
    }
}

