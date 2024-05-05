import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Agora infome seu nome: ");
            String nomeCliente = scanner.nextLine();

            System.out.println(" digite o numero da sua conta: ");
            System.out.println("Exemplo: 1021");
            int numeroConta = scanner.nextInt();

            System.out.println(" agora infome a agência:");
            System.out.println("Exemplo: 067-8");
            String numeroAgencia = scanner.next();


            System.out.print("Infome seu saldo: ");
            double saldo = scanner.nextDouble();

            System.out.println(
                "Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + 
                numeroAgencia + ", conta " + numeroConta + " e seu saldo é " + saldo + 
                " já está disponível para saque." );
        }
    }
}
