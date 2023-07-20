import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {
        
        char resposta, sexo;
        int nSim = 0, nNao = 0, qMasc = 0, qMascNao = 0, qFem = 0, qFemSim = 0;


        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2000; i++) {
            System.out.print("Digite o sexo do entrevistado('m' para masculino e 'f' para feminino): ");
            sexo = sc.next().charAt(0);
            System.out.print("Digite a resposta ('s' para Sim e 'n' para Não): ");
            resposta = sc.next().charAt(0);

            if (sexo == 'f') {
                qFem += 1;
                if (resposta == 's') {
                    qFemSim += 1;
                    nSim += 1;                    
                } else {
                    nNao += 1;
                }
            } else {
                qMasc +=1;
                if (resposta == 'n') {
                    qMascNao += 1;
                    nNao += 1;                    
                } else {
                    nSim += 1;
                }
            }
        }

        System.out.println("Nº de pessoas que responderam SIM: " + nSim);
        System.out.println("Nº de pessoas que responderam NÃO: " + nNao);
        System.out.println("Porcentagem de pessoas do sexo feminino q responderam SIM: " + (qFemSim * 100) / qFem + "%" );
        System.out.println("Porcentagem de pessoas do sexo masculino q responderam NÃO: " + (qMascNao * 100) / qMasc + "%" );

        sc.close();
    }
    
}
