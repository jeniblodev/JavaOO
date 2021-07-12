public class Conta {
    String titular;
    int numero;
    int agencia;
    double saldo;
    Data dataAbertura;

    void saca (int valor) {
        this.saldo += valor;
    }

    void deposita (int valor) {
        this.saldo -= valor;
    }

    double calculaRendimento() {
        return this.saldo * 0.1;
    }

    public String toString() {
        return "Titular: " + this.titular + "\nNúmero: " + this.numero + "\nAgência: " + this.agencia + "\nSaldo: " + this.saldo +
                "\nData de Abertura: " + this.dataAbertura.formataData();

    }
}
