import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o parâmetro inicial:");
        int parametroInicial = scanner.nextInt();
        System.out.println("Informe o parâmetro final:");
        int parametroFinal = scanner.nextInt();

        try {
            contar(parametroInicial, parametroFinal);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }

    }

    static void contar(int parametroInicial, int parametroFinal) throws ParametrosInvalidosException {
        if (parametroInicial > parametroFinal) {
            throw new ParametrosInvalidosException("O parâmetro inicial não pode ser maior que o parâmetro final!");
        }
        int contagem = parametroFinal - parametroInicial;
        for (int i=1; i<=contagem; i++) {
            System.out.println("Imprimindo o número "+ i);
        }
    }
}
