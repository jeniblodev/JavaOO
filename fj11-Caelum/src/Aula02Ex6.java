public class Aula02Ex6 {
    // Imprima os primeiros	números da série de Fibonacci até passar de 100

    public static void main(String[] args) {
        int numeroAnterior = 0;
        int numeroAtual = 1;

        while (numeroAtual < 100) {
            System.out.println(numeroAtual);
            int proximoNumero = numeroAnterior + numeroAtual;
            numeroAnterior = numeroAtual;
            numeroAtual = proximoNumero;
        }
        System.out.println(numeroAtual);
    }
}
