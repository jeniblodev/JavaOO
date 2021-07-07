public class Aula01Ex1Variaveis {
    //Na empresa em que	trabalhamos, há	tabelas	com	o gasto	de cada	mês. Para fechar o balanço do primeiro trimestre,
    //precisamos somar o gasto total. Sabendo que, em janeiro, foram gastos 15 mil reais, em fevereiro, 23 mil reais e,
    //em março,	17 mil reais, faça um programa que calcule e imprima a despesa total no	trimestre e	a média	mensal de gastos.

    public static void main(String[] args) {
        int janeiro = 15000;
        int fevereiro = 23000;
        int marco = 17000;

        int despesaTrimestre = janeiro + fevereiro + marco;
        System.out.println("A despesa total do trimestre é de R$" + despesaTrimestre);

        int mediaMensal = despesaTrimestre/3;
        System.out.println("A média mensal de gastos é de R$" + mediaMensal);
    }
}
