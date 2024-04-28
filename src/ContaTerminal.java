/**
 * <h1>Conta banco</h1>
 * A conta banco é um sistema que solicita determinadas informações 
 * e em seguida o sistema exibe uma mensagem para o usuario.
 * 
 * @author Jonathan Pereira
 * @version 1.0
 * @since 28/04/2024
 */

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
 
        System.out.println("Por favor,digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldoConta = scanner.nextDouble();

        System.out.printf("Olá, %s! Obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo disponível é de R$ %.2f.\n", 
        nomeCliente, numeroAgencia, numeroConta, saldoConta);
       
        scanner.close();
    }

}
