package br.com.vvatte;

import java.util.ArrayList;
import java.util.List;

public class BackTracking {

    public static List<List<Integer>> gerarSubconjuntos(int[] conjuntoS, int n) {
        List<List<Integer>> resultados = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        backtrack(conjuntoS, n, 0, temp, resultados);

        return resultados;
    }

    private static void backtrack(int[] conjuntoS, int n, int inicio, List<Integer> temp, List<List<Integer>> resultados) {
        if (temp.size() == n) {
            resultados.add(new ArrayList<>(temp));
            return;
        }

        for (int i = inicio; i < conjuntoS.length; i++) {
            temp.add(conjuntoS[i]);
            backtrack(conjuntoS, n, i + 1, temp, resultados);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] elementos = {1, 2, 3};
        int n = 2;

        List<List<Integer>> subconjuntos = gerarSubconjuntos(elementos, n);

        System.out.println("Subconjuntos de tamanho " + n + ":");
        for (List<Integer> subconjunto : subconjuntos) {
            System.out.println(subconjunto);
        }

        int[] elementos2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int n2 = 2;

        List<List<Integer>> subconjuntos2 = gerarSubconjuntos(elementos2, n2);

        System.out.println("Subconjuntos de tamanho " + n2 + ":");
        for (List<Integer> subconjunto : subconjuntos2) {
            System.out.println(subconjunto);

        }
        System.out.println("Existem " + subconjuntos2.size() + " subconjuntos");

    }
}