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

        Student[] students = stGen.studentGenerator(100);
        Schudder.schud(students);
  
//        timeStart = stopwatch.elapsedTime();
        QuickSort.QSortStudents(students, 1, students.length-1);
//        timeEnd = stopwatch.elapsedTime();
//        lapTime = timeEnd - timeStart;
//        System.out.printf(" (%.3f \t %.3f)\n", lapTime, timeEnd);
        
 for (int i = 0; i < students.length; i++) {
            System.out.println(i + " " + students[i]);
        }

        BinaryTree BTS = new BinaryTree();
        
        for (Student student : students) {
            BTS.put(student.getGrade(), student.getStudentNumber());   
        }
        
        System.out.println(BTS.rank(5.0));

    }
}
