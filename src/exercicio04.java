public class exercicio04 {

    public static void main(String[] args) {
        
        double paisA = 90000000, paisB = 200000000;
        int ano = 0;

        while (paisA < paisB) {
            paisA = (paisA * 0.03) + paisA;
            paisB = (paisB * 0.015) + paisB;
            ano += 1;            
        }
        
        System.out.println("Quantidade de anos: " + ano);
    }
    
}
