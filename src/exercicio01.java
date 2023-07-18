import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        char sexo;
        float altura = 0, maiorAltura, menorAltura, mediaAlturaMulheres;
        int numHomens;

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i < 51; i++) {
            do {
                System.out.print("Digite a altura do indivíduo nº " + i + " :");
                altura = sc.nextFloat();
                if (altura < 1 & altura > 2.5) {
                    System.out.println("Por gentileza digite uma altura válida!!!");
                }
            } while (altura < 1 & altura > 2.5);
            do {
                System.out.println("Digite o sexo do indivíduo nº " + i);
                System.out.print("Sendo 'm' para masculino e 'f' para feminino: ");
                sexo = sc.next().charAt(0);
                if (sexo != 'm' & sexo != 'f') {
                    System.out.println("Por gentileza digite um valor válido para o sexo do indivíduo!!!");
                }
            } while (sexo != 'm' & sexo != 'f');

        }

        sc.close();
    }

}