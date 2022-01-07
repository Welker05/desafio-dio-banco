public class Main {

    public static void main(String[] args) {
        Cliente welker = new Cliente();
        welker.setNome("Welker");
        Conta cc = new ContaCorrente(welker);
        Conta poupanca = new ContaPoupanca(welker);
        Cartao test = new CartaoCredito(welker);
        cc.depositar(1000);
        cc.transferir(150,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        test.dadosCartaoCredito();
    }
}
