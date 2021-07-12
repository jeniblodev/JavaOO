public class Aula02Ex3 {
    // Imprima todos os	múltiplos de 3, entre 1	e 100

    public static void main(String[] args) {


        for (int numero = 1; numero < 100; numero++) {
            if (numero % 3 == 0) {
                System.out.println(numero);
            }

        }
    }
}
