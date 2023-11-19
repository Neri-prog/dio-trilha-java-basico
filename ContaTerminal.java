import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bem Vindos ao Banco!");
        System.out.println();
        System.out.println("Porfavor digite o seu nome: ");
        String nome = input.nextLine();
        System.out.println("Porfavor digite o número da agência: ");
        String agencia = input.nextLine();
        System.out.println("Digite o numero da conta");
        int conta = input.nextInt();
        System.out.println("Digite o saldo");
        double saldo = input.nextDouble();
        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " ,conta " + conta + " ,e seu saldo é R$ " + saldo + " que já está disponivel para saque.");
        input.close();

    }
}