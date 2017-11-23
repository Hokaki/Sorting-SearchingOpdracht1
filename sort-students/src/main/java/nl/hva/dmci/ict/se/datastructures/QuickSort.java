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
    
     public static void QSortStudents(Comparable[] s, int low, int high){
        if(high<= low) return;
        int tl = low, i= low+1, tg = high;
        Comparable v = s[low];
        while (i <=tg){
            int cmp = s[i].compareTo(v);
            if( cmp <0) exch(s, tl++, i++);
            else if(cmp > 0) exch(s, i, tg--);
            else i++;
        }
        QSortStudents(s, low, tl-1);
        QSortStudents(s, tg+1, high);
    }
    
    public static int partition(Comparable[] s, int low, int high){
        int i = low, j = high+1;
        Comparable v = s[low];
        while(true){
            while (less(s[++i], v)) if (i == high) break;
            while (less(v, s[--j])) if (j == low) break;
            if( i >=j) break;
            exch(s, i, j);
        }
        exch(s, low, j);
        return j;    
    }
    
    private static boolean less(Comparable a, Comparable b){
        return a.compareTo(b) < 0;
    }
    
    private static void exch(Comparable[] a, int i, int j){
        Comparable t = a[i]; a[i] = a[j]; a[j] = t;
    }
}
