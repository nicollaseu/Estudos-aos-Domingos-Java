import java.util.Scanner;

public class TomadaDecisaoIFElse {
    public static void main(String[] args) {
        Scanner scaner  = new Scanner(System.in);

        int idade;
        System.out.print("Digite sua idade: ");
        idade = scaner.nextInt();
        if (idade >= 18) {
            System.out.println("Pode tirar CNH");
            idade = scaner.nextInt();
        } else if (idade == 17 ) {
            System.out.println("Calma meu jovem falta pouco");
        } else {
            System.out.println("Ainda não é o momento de tirar CNH");
        }
    }
}
