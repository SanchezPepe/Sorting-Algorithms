/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sortingalgorithms;

/**
 *
 * @author Pepe
 */
public class SortingAlgorithms<T extends Comparable<T>> {

    /**
     * Sort
     */
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

    //MÉTODOS AUXILIARES
    public void swap(T arre[], int i, int j) {
        T aux = arre[i];
        arre[i] = arre[j];
        arre[j] = aux;
    }

    public String impArre(T arre[]) {
        StringBuilder cad = new StringBuilder();
        cad.append("Arreglo:\n");
        int i = 0;
        while (i < arre.length) {
            cad.append(arre[i]).append(" ");
            i++;
        }
        return cad.toString();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        SortingAlgorithms<Integer> s = new SortingAlgorithms<Integer>();
        Integer arre[] = {93,62,30,88,84,56,11,82,91,75,13,94,36};
        s.SelectionSort(arre);
        System.out.println(s.impArre(arre));

    }

}
