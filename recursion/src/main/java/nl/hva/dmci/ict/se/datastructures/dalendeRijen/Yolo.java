/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hva.dmci.ict.se.datastructures.dalendeRijen;

import java.util.ArrayList;
import java.util.List;
import nl.hva.dmci.ict.se.datastructures.DictionaryGenerator;

/**
 *
 * @author Alexander van den Herik
 */
public class Yolo implements DictionaryGenerator {

    @Override
    public String[] yololian(int n) {
        System.out.println(n);
        if (n != 0) {
            if (n == 1) {
                return new String[]{"yo", "lo"};
            }
            String[] yoloWoorden = yololian(n - 1);
            ArrayList<String> yoloWoordjes = new ArrayList<String>();
            for (String yoloWoord : yoloWoorden) {
                
                yoloWoordjes.add("yo" + yoloWoord);
                yoloWoordjes.add("lo" + yoloWoord);
            }
            
            String[] yoloWoorden2 = new String[yoloWoordjes.size()];
            for (int i = 0; i < yoloWoordjes.size(); i++) {
                yoloWoorden2[i] = yoloWoordjes.get(i);
            }
            return yoloWoorden2;
        }
        String[] niks = new String[1];
        niks[0] = "";
        return niks;
    }

    @Override
    public String[] language(int n, String[] syllables) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
