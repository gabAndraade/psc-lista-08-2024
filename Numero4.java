import java.util.Scanner;
public class Numero4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de sua escolha (pode ser negativo ou positivo):");
        double n1 = scanner.nextDouble();

        String PN = verificar(n1);
        System.out.println(n1+" É um número "+PN);
        scanner.close();
    }
    public static String verificar(double n1){
        if (n1>0) {
            return "P";
        }else{
            return "N";
        }
    }
}
