public class ListaContas {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Data data = new Data();

        conta1.titular = "Henrique";
        conta1.numero = 123456789;
        conta1.agencia = 001;
        conta1.saldo = 100.5;
        conta1.dataAbertura = data;

        conta1.dataAbertura.criaData(12,07,2021);

        System.out.println(conta1.toString());


    }
}
