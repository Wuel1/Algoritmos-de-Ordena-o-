package ordenacao.algoritms;

import ordenacao.Sorter;

public class SelectionSort implements Sorter{

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        for(int i = 0; i < sorted.length-1; i++){
            int pivo = i;
            for(int j = i; j < sorted.length; j++){
                if(sorted[j] < sorted[pivo]){
                    pivo = j;
                }
            }
            int controle = sorted[pivo];
            sorted[pivo] = sorted[i];
            sorted[i] = controle;
        }

        return sorted;           
        }

        @Override
        public String getName() {
            return "SelectionSort";
        }
}


