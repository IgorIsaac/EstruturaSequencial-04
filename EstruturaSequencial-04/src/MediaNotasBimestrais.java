import java.util.Scanner;

public class MediaNotasBimestrais {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira as notas bimestrais
        System.out.print("Digite a nota do 1º bimestre: ");
        double nota1 = scanner.nextDouble(); // Lê uma nota digitada pelo usuário

        System.out.print("Digite a nota do 2º bimestre: ");
        double nota2 = scanner.nextDouble(); // Lê uma nota digitada pelo usuário

        System.out.print("Digite a nota do 3º bimestre: ");
        double nota3 = scanner.nextDouble(); // Lê uma nota digitada pelo usuário

        System.out.print("Digite a nota do 4º bimestre: ");
        double nota4 = scanner.nextDouble(); // Lê uma nota digitada pelo usuário

        // Calcular a média das notas
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Exibir o resultado da média
        System.out.println("A média das notas bimestrais é: " + media);

        // Fechar o objeto Scanner
        scanner.close();
    }
}
