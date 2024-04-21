import java.util.Scanner;
public class Numero3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe três números inteiros de sua escolha:");
        int n1= scanner.nextInt();
        int n2= scanner.nextInt();
        int n3= scanner.nextInt();
        System.out.println("A soma dos números é: "+soma(n1, n2, n3));
        scanner.close();   
    }
    public static int soma(int n1,int n2,int n3){
        return n1+n2+n3;

    }
}
