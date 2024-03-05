import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        BemVindos saudacao = new BemVindos();
        saudacao.imprimirMensagem("========= Sejam todos Bem Vindos ao Banco Digital XDall =========\n");


        Cliente cliente = new Cliente();

        System.out.println("Por gentileza, Digite seu Nome");
        String nome = sc.nextLine();
        cliente.setNome(nome);

        
        Conta cc = new ContaCorrente(cliente);

        System.out.println("Por gentileza, Digite sua Agencia (Agencia padrao = 0001)");
        int contaC = sc.nextInt();
        cc.setAgencia(contaC);

        Conta poupanca = new ContaPoupanca(cliente);
        

        cc.depositar(290);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();


    }
    
}
