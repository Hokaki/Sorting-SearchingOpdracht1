/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import model.Student;
import nl.hva.dmci.ict.se.datastructures.KlasGenerator;
import nl.hva.dmci.ict.se.datastructures.QuickSort;
import nl.hva.dmci.ict.se.datastructures.SelectionSort;
import nl.hva.dmci.ict.se.datastructures.SortBucket;
import nl.hva.dmci.ict.se.datastructures.StudentGenerator;
import nl.hva.dmci.ict.se.datastructures.util.Schudder;
import nl.hva.dmci.ict.se.datastructures.dalendeRijen.DalendeRijen;

/**
 *
 * @author Alexander van den Herik
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
                StudentGenerator stGen = new StudentGenerator();
                
                Student[] students = stGen.studentGenerator(16000);
                Schudder.schud(students);
                
   
        for (int i = 0; i < students.length; i++) {
            System.out.print(i);
            System.out.println(students[i]);
        }
        
        QuickSort.QSortStudents(students, 1, students.length-1);
        
        for (int i = 0; i < students.length; i++) 
        {
            System.out.println(students[i]);
        }
        
        
    }
}
