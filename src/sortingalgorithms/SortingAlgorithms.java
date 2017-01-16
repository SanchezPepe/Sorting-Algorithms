/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

import java.util.Random;

/**
 *
 * @author Pepe
 */
public class SortingAlgorithms<T extends Comparable<T>> {

    
    public void SelectionSort(T elems[]) {
        int min;
        for (int i = 0; i < elems.length; i++) {
            min = i;
            for (int j = i; j < elems.length; j++) {
                if (elems[j].compareTo(elems[min]) <= 0)
                    min = j;
            }
            swap(elems, i, min);
        }
    }
    
    public void InsertionSort(T elems[]){
        int i, j;
        T aux;
        for(i = 1; i < elems.length; i++){
            aux = elems[i];
            j = i-1;
            while(j >= 0 && aux.compareTo(elems[j]) < 0){
                elems[j+1] = elems[j];
                j--;
            }
            elems[j+1] = aux;
        }
    }
    
    public void BubbleSort(T elems[]){
        for(int i = elems.length-1; i >= 0; i--){
            for(int j = 0; j < i; j++){
                if(elems[j].compareTo(elems[j+1]) > 0)
                    swap(elems, j, j+1);
            }
        }
    }
    
    public void quickSort(T arre[]){
        quickSort(arre, 0, arre.length-1);
    }
    
    private void quickSort(T arre[], int min, int max){
        int pivote;
        if(min >= max)
            return;
        pivote = particion(arre, min, max);
        quickSort(arre, min, pivote - 1); //Subarreglo izquierdo
        quickSort(arre, pivote + 1, max); //Subarreglo derecho
    }
    
    public int particion(T arre[], int min, int max){
        T aux = arre[max];
        int i = min - 1;
        for(int j = min; j <= max; j++)
            if(arre[j].compareTo(aux) < 0){
                i++;
                swap(arre, i, j);
            }
        swap(arre, i + 1, max);
        return i + 1;
    }

    //MÉTODOS AUXILIARES
    public void swap(T arre[], int i, int j) {
        T aux = arre[i];
        arre[i] = arre[j];
        arre[j] = aux;
    }

    public void impArre(T arre[]) {
        StringBuilder cad = new StringBuilder();
        cad.append("Arreglo:\n");
        int i = 0;
        while (i < arre.length) {
            cad.append(arre[i]).append(" ");
            i++;
        }
        System.out.println(cad.toString());
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SortingAlgorithms<Integer> s = new SortingAlgorithms<Integer>();
        //Integer arre[] = {93,62,30,88,84,56,11,82,91,75,13,94,36};
        Integer arre[] = {93,642,330,1};
        s.impArre(arre);
        s.quickSort(arre);
        s.impArre(arre);

    }

}
