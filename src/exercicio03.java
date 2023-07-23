import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        
        String mercadoria;
        float precoCompra, precoVenda, totalcompra = 0, totalvenda = 0;
        int menor10 = 0, entre1020 = 0, maior20 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println();
        System.out.println("                    --- CONTROLE DE ESTOQUE ---");
        System.out.println("Digite 'enter' em nome de mercadoria para sair!");

        do {
            System.out.print("Digite o NOME da mercadoria a ser inserida: ");
            mercadoria = sc.nextLine();
            if (mercadoria.equals("")) {
                break;
            }
            System.out.print("Digite o VALOR DE COMPRA da mercadoria: R$ ");
            precoCompra = Float.parseFloat(sc.nextLine());
            System.out.print("Digite o PREÇO DE VENDA da mercadoria: R$ ");
            precoVenda = Float.parseFloat(sc.nextLine());

            if ((precoCompra*0.1 + precoCompra) < precoVenda) {
                menor10 += 1;
            } else if ((precoCompra*0.1 + precoCompra) >= precoVenda && (precoCompra*0.2 + precoCompra) <= precoVenda) {
                entre1020 += 1;                
            } else {
                maior20 += 1;
            }

            totalcompra = totalcompra + precoCompra;
            totalvenda = totalvenda + precoVenda;
        } while (!mercadoria.equals(""));

        sc.close();

        System.out.println("ENCERRAMENTO:");
        System.out.println("Quantidade de mercadorias com lucro inferior a 10 %");
        System.out.println("--> " + menor10 + " mercadorias");
        System.out.println("Quantidade de mercadorias com lucro entre 10% e 20%");
        System.out.println("--> " + entre1020 + " mercadorias");
        System.out.println("Quantidade de mercadorias com lucro superior a 20 %");
        System.out.println("--> " + maior20 + " mercadorias");
        System.out.println("_________________________");
        System.out.println("Preço total de COMPRA de todas as mercadorias: R$ " + totalcompra);
        System.out.println("Preço total de VENDA  de todas as mercadorias: R$ " + totalvenda);

    }
    
}
