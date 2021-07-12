public class Aula02Ex4 {
    //Imprima os fatoriais de 1	a 10

    public static void main(String[] args) {

        int fatorial = 1;
        for (int numero = 1; numero <= 10; numero++) { // para calcular fatoriais de numeros maiores que 15 é preciso mudar o tipo para long
            fatorial = fatorial * numero;
            System.out.println("O fatorial de " + numero + " é " + fatorial);
        }
    }
}
