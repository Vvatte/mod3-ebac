package br.com.vvatte;

public class AlgoritmoGuloso {

    public static int[] moedas = {5, 2, 1}; // Valores das moedas (ex: centavos)

    public static int[] calcularTroco(int valor) {
        int[] resultado = new int[moedas.length];
        int restante = valor;

        for (int i = 0; i < moedas.length; i++) {
            while (restante >= moedas[i]) {
                resultado[i]++;
                restante -= moedas[i];
            }
        }

        return resultado;
    }


    public static void main(String[] args){
        int valorTroco = 18;
        int[] troco = calcularTroco(valorTroco);

        System.out.println("Troco de " + valorTroco + ":");
        for (int i = 0; i < moedas.length; i++) {
            if (troco[i] > 0) {
                System.out.println(troco[i] + " moedas de " + moedas[i]);
            }
        }
    }
}
