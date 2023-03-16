package ordenacao.algoritms;

import java.util.Arrays;

import ordenacao.Sorter;

public class MergeSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int[] sorted = elements.clone();
        if (sorted.length < 2) {
            return sorted;
        }
        int metade = (int) Math.floor(sorted.length / 2);
        int[] esquerda = Arrays.copyOfRange(sorted, 0, metade);
        int[] direita = Arrays.copyOfRange(sorted, metade ,sorted.length);
        esquerda = sort(esquerda);
        direita = sort(direita);
        juntar(sorted, esquerda, direita);
        return sorted;
    }
    
    public void juntar(int[] lista , int[] esquerda, int[] direita) {
        int i = 0;
        int j = 0;
        int r = 0;        
        while (i < esquerda.length && j < direita.length) {
            if (esquerda[i] <= direita[j]) {
                lista[r] = esquerda[i];
                i++;
            } else {
                lista[r] = direita[j];
                j++;
            }
         r++;            
        }
        while (i < esquerda.length) {
            lista[r] = esquerda[i];
            i++;
            r++;
        }
        while (j < direita.length) {
            lista[r] = direita[j];
            j++;
            r++;
        }        
    }
    

    @Override
    public String getName() {
        return "MergeSort";
    }

}
