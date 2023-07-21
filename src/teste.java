import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        
        char teste;
        Scanner sc = new Scanner(System.in);
        teste = sc.next().charAt(0);
        
        if (teste == '\0') {

            System.out.println("vazio");
        }

        sc.close();
    }
     
}
