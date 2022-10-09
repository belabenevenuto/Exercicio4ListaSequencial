import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, mediaAnual;
        Scanner teclado = new Scanner(System.in);
        nota1 = teclado.nextDouble();
        nota2 = teclado.nextDouble();
        nota3 = teclado.nextDouble();
        nota4 = teclado.nextDouble();
        mediaAnual = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Sua média anual é " + mediaAnual);

    }
}
