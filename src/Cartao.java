
import java.time.LocalDate;

public class Cartao extends Conta{

    private static int Sequence_Numero = 1;
    private static int Sequence_CodigoSeguranca = 100;
    private int numeroCartao, codigoSeguranca;
    private LocalDate dataValidade;
    private Cliente cliente;

    public Cartao(Cliente cliente){
        this.numeroCartao = Sequence_Numero++;
        this.codigoSeguranca = Sequence_CodigoSeguranca++;
        this.dataValidade = hoje.plusYears(5);
        this.cliente = cliente;
    }

    LocalDate hoje = LocalDate.now();

    public int getNumeroCartao() {
        return numeroCartao;
    }

    public int getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public LocalDate getDataValidade() {
        return dataValidade;
    }

    public Cliente getCliente() {
        return cliente;
    }

    protected void imprimirDadosCartao(){
        System.out.println("Nome do titular: " + cliente.getNome());
        System.out.println("Numero do cartão: " + this.numeroCartao);
        System.out.println("Codigo de seguranca do cartão: " + this.codigoSeguranca);
        System.out.println("Validade do cartão: " + this.dataValidade);
    }

    @Override
    public void imprimirExtrato() {
    }

    @Override
    public void dadosCartaoCredito() {

    }


}
