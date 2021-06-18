public class ContaCorrente extends Conta implements Tributos{
    private double chequeEspecial;
    private double valorImposto;
    private  double juros;

    public ContaCorrente (String nome, String cpf ,int numero, int agencia, String banco, double saldo, double chequeEspecial) {
        super(nome, cpf, numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
        this.valorImposto = jurosImposto(juros);
    }

    @Override
    public String toString() {
        return super.toString() + "ContaCorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }

    @Override
    public boolean sacar(double quantia) {
        double disponivel = this.chequeEspecial + this.saldo;
        if (quantia > disponivel){
            System.out.println("Você não tem limite disponivel. ");
            return false;
        }else{
            this.saldo -= quantia;
            return true;
        }
    }

    @Override
    public double getSaldo() {
        return (this.saldo = (1 - valorImposto ) * saldo) + this.chequeEspecial;

    }


    @Override
    public double jurosImposto(double juros) {
        return juros = 0.02;
    }
}
