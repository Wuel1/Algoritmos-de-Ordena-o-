package ordenacao.algoritms;

import ordenacao.Sorter;

public class InsertionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        for(int i = 1; i< sorted.length;i++){
            int pivo = sorted[i];
            int aux = i-1;
            while((aux > -1) && (sorted[aux] > pivo)){
                sorted[aux+1] = sorted[aux];
                aux = aux -1;
            }
            sorted[aux + 1] = pivo;
        }
        return sorted;
    }

    @Override
    public String getName() {
        return "InsertionSort";
    }

}
