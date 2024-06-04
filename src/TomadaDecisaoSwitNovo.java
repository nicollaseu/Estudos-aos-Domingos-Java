import java.util.Scanner;

public class TomadaDecisaoSwitNovo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Digite o dia da semana (Ex: seg, ter, qua, qui, sexta, sab, dom): ");
        String diaSemana = scanner.nextLine();
        System.out.printf("Horário de funcionamento: %s\n", switch (diaSemana){

            case "seg" -> "FECHADO";
            case "ter", "qua", "qui", "sex" -> "ABERTO DAS: 08:00 AS 18:00";
            case "sab", "dom" -> "ABERTO DAS: 08:00 AS 12:00";
            default -> "DIA INVALIDO";
        });
    }
}
