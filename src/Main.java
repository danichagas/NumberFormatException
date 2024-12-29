import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        String age = sc.nextLine();

        try {
            int number = Integer.parseInt(age);
            System.out.println("Sua idade é: ".concat(age));
        } catch (NumberFormatException numberFormatException) {
            System.err.println("Erro, o valor deve ser um número inteiro, e não pode conter letras!");
            System.err.println(numberFormatException.getMessage());
        }
    }
}