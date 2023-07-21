import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {
        
        char sexo;
        int nNascimento, idadeMorta, nMasc = 0, n24 = 0, totalMorta = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de crianças nascidas: ");
        nNascimento = sc.nextInt();
        do {
            System.out.println("Digite o sexo da criança morta, sendo 'm' para masculino e 'f' para feiminino: ");
            sexo = sc.next().charAt(0);
            if (sexo == ' ') {
                System.out.println("vazio");
                break;
            }
            System.out.println("Digite a idade em meses da criança morta: ");
            idadeMorta = sc.nextInt();
            totalMorta += 1;
            if (sexo == 'm') {
                nMasc += 1;
            }
            if (idadeMorta <= 24) {
                n24 += 1;
            }

        } while (sexo != ' ');

        System.out.println("A porcentagem de crianças mortas no período é de: " + (totalMorta * 100) / nNascimento);
        System.out.println("A porcentagem de crianças do sexo masculino mortas no período é de: " + (nMasc * 100) / totalMorta);
        System.out.println("A porcentagem de crianças que viveram 24 meses ou mais é de: " + (n24 * 100) / totalMorta);

        sc.close();
    }
    
}
