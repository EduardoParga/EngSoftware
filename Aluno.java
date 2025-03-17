import java.util.Scanner;

public class Aluno {
    /** Nota mínima para aprovação. */
    private static final double NOTA_MINIMA = 7.0;
    /** Divisor usado para calcular a média das notas. */
    private static final int DIVISOR = 2;

    /**
     * @param args argumentos
     */
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Nota AP1: ");
        double ap1 = scanner.nextDouble();

        System.out.print("Nota AP2: ");
        double ap2 = scanner.nextDouble();
        double media = (ap1 + ap2) / DIVISOR;
        System.out.println("\nMédia: " + media);

        if (media >= NOTA_MINIMA) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado, precisa fazer AS.");

            System.out.print("Nota AS: ");
            double as = scanner.nextDouble();

            if (ap1 < ap2) {
                ap1 = as;
            } else {
                ap2 = as;
            }
            media = (ap1 + ap2) / DIVISOR;
            System.out.println("Nova média: " + media);

            if (media >= NOTA_MINIMA) {
                System.out.println("Aprovado após AS!");
            } else {
                System.out.println("Reprovado mesmo após AS.");
            }
        }

        scanner.close();
    }
}
