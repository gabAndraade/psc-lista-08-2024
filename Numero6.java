import java.util.Scanner;
public class Numero6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
        System.out.println("Informe as horas no formato HH:MM :");
        String horaTotal = scanner.nextLine();
        String horaConvertida = converterHoras(horaTotal);
        System.out.println("A hora convertida é: ");
        horaConvertida(horaConvertida);
        System.out.println("Deseja converter mais horas? Digite -1 para sair, para continuar digite -2.");
        int sair = scanner.nextInt();
        scanner.nextLine();
        if (sair == -1) {
            System.out.println("Encerrando...");
            break;
        }else if(sair == -2){
            continue;
        }
        
        
        }
        scanner.close();
    }
    public static String converterHoras (String horaTotal){
        String[] partes = horaTotal.split(":");
        int hora = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        String periodo;
        if (hora > 0 && hora <=12) {
            periodo = "A.M";            
        }else{
            periodo = "P.M";
            if(hora>12){
                hora-=12;
            }
        }
        return hora+":"+minutos+" "+periodo;
    }
    public static String horaConvertida(String horaAMPM){
        System.out.println("Hora convertida: "+horaAMPM);
        return horaAMPM;
    }
}
