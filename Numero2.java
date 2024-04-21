import java.util.Scanner;
public class Numero2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número inteiro de sua escolha:");
        int n1 = scanner.nextInt();
        for(int i = 1; i<=n1;i++){
            linha(i);
            System.out.println();
        }
        scanner.close();
    }
    public static void linha(int n){
        for(int i = 1; i<=n;i++){
            System.out.print(i+" ");
        }  
    }
}
