/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hva.dmci.ict.se.datastructures.dalendeRijen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Alexander van den Herik
 */
public class Main {
    
    public static void main(String[] args) {
//        List<Integer> rijtje;
//        rijtje = new ArrayList<Integer>(Arrays.asList(100, 200, 300, 400, 500));
//        
//        DalendeRijen dalendeRijen = new DalendeRijen();
//        
//        System.out.println(dalendeRijen.isStijgend(rijtje));
      
        Yolo yolo = new Yolo();
        String[] la = yolo.yololian(3);
        for (int i = 0; i < la.length; i++) {
            System.out.println(la[i]);
        }

    }
    
}
