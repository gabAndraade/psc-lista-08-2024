import java.util.Scanner;
public class Numero5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o preço do produto antes do imposto:");
        double antesImposto = scanner.nextDouble();
        System.out.println("Informe a taxa de imposto sobre vendas em porcentagem:");
        double taxaImposto = scanner.nextDouble();
        double custoTotal = somaImposto(taxaImposto, antesImposto);
        System.out.println("Preço total após o imposto: "+custoTotal);
        scanner.close();
    }
    public static double somaImposto(double taxaImposto, double custo){       
        double imposto = custo*(taxaImposto/100);
        double total = custo+imposto;
        return total;
    }
}
