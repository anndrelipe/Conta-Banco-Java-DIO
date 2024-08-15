import java.util.Scanner;
import java.text.MessageFormat;
import java.util.Locale;

public class ContaTerminal {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Para começarmos a criação da sua conta digite seu número de usuário: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, agora digite a sua agencia: ");
        String agencia = scanner.next();

        System.out.print("Muito bem! Fale um pouco mais de você. Qual o seu nome? ");
        String nome = scanner.next();

        System.out.print("Perfeito, " + nome + ". Para ficarmos mais perto de poder lhe ajudar, nos informe sua pretenção de saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.print(MessageFormat.format("Olá {0}, obrigado por criar uma conta em nosso banco, sua agência é {1}, conta {2} e seu saldo de R$ {3} já está disponível para saque.", nome, agencia, numero, saldo));
    }
}
