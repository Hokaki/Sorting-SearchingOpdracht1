/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hva.dmci.ict.se.datastructures;

import model.Student;
/**
 *
 * @author alwin
 */
public class QuickSort {
    /**
     * Quicksort methode om de studenten lijst te sorteren hierop is 3-way-partitioning toegepast
     * ge commenteerde deel is onderdeel van de onaangepaste quicksort
     * 
     * @param students
     * @param low
     * @param high 
     */
     public static void QSortStudents(Student[] students, int low, int high){
        if(high<= low) return;
//        int tl = low, i= low+1, tg = high;
        int j = partition(students, low, high);
//        Student v = students[low];
//        while (i <=tg){
//            int cmp = students[i].compareTo(v);
//            if( cmp <0) exch(students, tl++, i++);
//            else if(cmp > 0) exch(students, i, tg--);
//            else if(cmp == 0){
//               exch(students, tl++, i++);
//               i++;
//            }
//        }
//        QSortStudents(students, low, tl-1);
//        QSortStudents(students, tg+1, high);

        QSortStudents(students, low, j-1);
        QSortStudents(students, j+1, high);
    }
    
     /**
      * onderdeel van de onaangepaste quicksort
      * 
      * 
      * @param s
      * @param low
      * @param high
      * @return j
      */
    public static int partition(Student[] s, int low, int high){
        int i = low, j = high+1;
        Student v = s[low];
        while(true){
            while (less(s[++i], v)) if (i == high) break;
            while (less(v, s[--j])) if (j == low) break;
            if( i >=j) break;
            exch(s, i, j);
        }
        exch(s, low, j);
        return j;    
    }
    
    
    /**
     * vergelijk methode om te kijken of a kleiner is dan b 
     * 
     * @param a
     * @param b
     * @return 
     */
    private static boolean less(Student a, Student b){
        return a.compareTo(b) < 0;
    }
    /**
     * methode om verschillende studenten te verplaatsen in de array
     * 
     * @param a
     * @param i
     * @param j 
     */
    private static void exch(Student[] students, int i, int j){
        Student t = students[i]; 
        students[i] = students[j]; 
        students[j] = t;
    }
}
