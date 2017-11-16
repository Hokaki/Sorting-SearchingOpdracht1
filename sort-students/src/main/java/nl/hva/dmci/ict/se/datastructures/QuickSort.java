/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hva.dmci.ict.se.datastructures;

/**
 *
 * @author alwin
 */
public class QuickSort {
    private static void quicksortGrade(int low, int high, Student[] Slist) {
            int i = low, j = high+1;
            // Get the pivot element from the middle of the list
            int pivot = (int) Slist[low + (high-low)/2].getGrade();

            // Divide into two lists
            while (i <= j) {
                    // If the current value from the left list is smaller then the pivot
                    // element then get the next element from the left list
                    while (Slist[i].getGrade() <= pivot) {
                            i++;
                    }
                    // If the current value from the right list is larger then the pivot
                    // element then get the next element from the right list
                    while (Slist[j].getGrade() > pivot) {
                            j--;
                    }

                    // If we have found a values in the left list which is larger then
                    // the pivot element and if we have found a value in the right list
                    // which is smaller then the pivot element then we exchange the
                    // values.
                    // As we are done we can increase i and j
                    if (i <= j) {
                            exchangeGrade(i, j, Slist);
                            i++;
                            j--;
                    }
            }
            // Recursion    
            if (low < j)
                    quicksortGrade(low, j-1, Slist);
            if (i < high)
                    quicksortGrade(i+1, high, Slist);
    }
}
