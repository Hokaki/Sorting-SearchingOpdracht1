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
import nl.hva.dmci.ict.se.datastructures.BinaryTree;
import nl.hva.dmci.ict.se.datastructures.KlasGenerator;
import nl.hva.dmci.ict.se.datastructures.QuickSort;
import nl.hva.dmci.ict.se.datastructures.SelectionSort;
import nl.hva.dmci.ict.se.datastructures.SortBucket;
import nl.hva.dmci.ict.se.datastructures.Stopwatch;
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
            
        Stopwatch stopwatch = new Stopwatch();
        double timeStart, timeEnd, lapTime;
        
        StudentGenerator stGen = new StudentGenerator();

        Student[] students = stGen.studentGenerator(10000);
        Schudder.schud(students);
  
//        timeStart = stopwatch.elapsedTime();
        QuickSort.QSortStudents(students, 0, students.length-1);
        for (int i = 0; i < students.length; i++) {
            System.out.println(i+1 + " " + students[i]);
        }
//        Schudder.schud(students);
  
//        timeEnd = stopwatch.elapsedTime();
//        lapTime = timeEnd - timeStart;
//        System.out.printf(" (%.3f \t %.3f)\n", lapTime, timeEnd);
        
// for (int i = 0; i < students.length; i++) {
//            System.out.println(i + " " + students[i]);
//        }

        BinaryTree BTS = new BinaryTree();
        
        for (int i = 0; i < students.length-1; i++) {
            BTS.put(students[i].getGrade(), students[i].getStudentNumber());   
        }
        
        System.out.println(BTS.rank(10.0));

    }
}
