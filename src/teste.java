import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        
        
        String teste1;       
        Scanner sc = new Scanner(System.in);
        
        teste1 = sc.nextLine();
        
        if (!teste1.equals("")) {
            System.out.println("não igual a vazio");
        }
                
        if (teste1.equals("")) {

            System.out.println("vazio");
        }

        sc.close();
        System.out.println("variavel:_" + teste1 + "_");
    }
     
}
