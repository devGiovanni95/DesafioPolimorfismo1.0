public class ContaPoupanca extends Conta {
    private int diaAniversario;
    private double taxaDeJuros;

    public ContaPoupanca(String nome, String cpf, int numero, int agencia, String banco, double saldo, int diaAniversario) {
        super(nome, cpf, numero, agencia, banco, saldo);
        this.diaAniversario = diaAniversario;
        this.taxaDeJuros = getTaxaDeJuros();
    }


    public double getSaldo() {

        if (this.diaAniversario > 0 && this.diaAniversario <= 20) {

            return this.saldo + this.taxaDeJuros * this.saldo;

        } else {

            return this.saldo + this.taxaDeJuros * this.saldo;

        }
    }

    @Override
    public boolean sacar(double quantia) {
        if (quantia > this.saldo) {
            System.out.println("Você não tem limite disponivel. ");
            return false;
        } else {
            this.saldo = this.saldo - quantia;
            return true;
        }
    }

    public double getTaxaDeJuros() {
        if (this.diaAniversario > 0 && this.diaAniversario <= 20) {

            taxaDeJuros = 0.03;

            return this.taxaDeJuros;

        } else {

            taxaDeJuros = 0.05;

            return this.taxaDeJuros;

        }
    }

    @Override
    public String toString() {
        return super.toString() + "ContaPoupanca{" +
                "diaAniversario=" + diaAniversario +
                ", taxaDeJuros=" + taxaDeJuros +
                '}';
    }
}


