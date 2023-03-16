package ordenacao.algoritms;

import ordenacao.Sorter;

public class QuickSort implements Sorter {

    @Override
    public int[] sort(int[] elements) {
        int [] sorted = elements.clone();
        int começo = 0;
        int fim = sorted.length - 1;
        quickSort(sorted, começo, fim);
        return sorted;
    }

    public static void quickSort(int[] lista, int inicio, int fim){
        if(inicio < fim){
           int elemento = parte(lista, inicio, fim);
           quickSort(lista, inicio, elemento - 1);
           quickSort(lista, elemento + 1, fim);                         
        }
    }

    public static int parte(int[] sorted, int inicio, int fim){        
        int pivo = sorted[inicio];
        int i = inicio + 1;
        int j = fim;
        while(i<=j){
            if(sorted[i]<= pivo){
                i++;
            }
            else if(pivo < sorted[j]){
                j--;
            }
            else{
                int controle = sorted[i];
                sorted[i] = sorted[j];
                sorted[j] = controle;
                i++;
                j--;
            }
        }        
        sorted[inicio] = sorted[j];
        sorted[j] = pivo;
        return j;
    }
      

    @Override
    public String getName() {
        return "QuickSort";
    }

}
