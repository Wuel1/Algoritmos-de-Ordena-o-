package ordenacao.algoritms;

import ordenacao.Sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        if(sorted.length <= 1){
            return sorted;
        }
        int metade = sorted.length/2;
        int[] direita = new int[metade];
        int[] esquerda = new int[sorted.length - metade];
        for(int i = 0; i < metade; i++){
            esquerda[i] = sorted[i];
        }
        for(int i = metade; i < sorted.length; i++){
            direita[i-metade] = sorted[i];
        }
        esquerda = sort(esquerda);
        direita = sort(direita);
        int[] listaOrdenada = juntar(esquerda, direita);
        return listaOrdenada;
    }

    public int[] juntar(int[] esquerda, int[] direita){
        int i = 0;
        int j = 0;
        int r = 0;
        int[] lista = new int[esquerda.length + direita.length];
        while(i < esquerda.length && j < direita.length){
            if(esquerda[i] < direita[j]){
                lista[r++] = esquerda[i++];
            }
            else{
                lista[r++] = direita[j++];
            }
        }
        while(i < esquerda.length){
            lista[r++] = esquerda[i++];
        }
        while(j < direita.length){
            lista[r++] = direita[j++];
        }
        return lista;
    }

    @Override
    public String getName() {
        return "MergeSort";
    }

}
