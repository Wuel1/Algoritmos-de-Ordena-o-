package ordenacao.algoritms;

import ordenacao.Sorter;

public class QuickSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        int começo = sorted[0];
        int fim = sorted[sorted.length-1];
        if(começo < fim){
            int[] PRIpivo = parte(sorted, começo, fim);
            sort(PRIpivo);
            return PRIpivo;
            }
            return sorted;
        }
    
    
    public int[] parte(int[] sorted, int menores, int maiores){        
        int pivo = sorted[0];
        int i = 0;
        int j = sorted.length - 1;
        while(i<=j){
            if(sorted[i]<= pivo){
                i = i+1;
            }
            else if(pivo < sorted[j]){
                j = j-1;
            }
            else{
                int controle = sorted[i];
                sorted[i] = sorted[j];
                sorted[j] = controle;
                i = i+1;
                j = j-1;
            }
        }        
        sorted[i] = sorted[j];
        sorted[j] = pivo;
        return sorted;
    }

    @Override
    public String getName() {
        return "QuickSort";
    }

}
