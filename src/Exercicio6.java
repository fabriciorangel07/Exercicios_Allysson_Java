public class Exercicio6 {
    public static void main(String[] args) throws Exception {

        System.out.println("Serie de Fibonacci!");
		
		System.out.println("");

		long num1 = 0;
		long num2 = 1;
        long soma;

		for (int cont = 0; cont <= 100; cont++){
			System.out.println(num1);
			soma = num1 + num2;
			num1 = num2;
			num2 = soma;
		}
	}
}