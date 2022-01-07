public class CartaoCredito extends Cartao{

    public CartaoCredito(Cliente cartao) {
        super(cartao);
    }

    @Override
    public void dadosCartaoCredito(){
        System.out.println("=== Dados Cartao Credito ===");
        super.imprimirDadosCartao();
    }
}
