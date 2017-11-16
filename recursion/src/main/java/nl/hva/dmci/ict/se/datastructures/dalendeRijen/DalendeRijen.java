/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.hva.dmci.ict.se.datastructures.dalendeRijen;

import java.util.List;

/**
 *
 * @author Alexander van den Herik
 */
public class DalendeRijen implements nl.hva.dmci.ict.se.datastructures.RijtjesControle {

    private int i = 0;
    private boolean isStijgend = true;
    
    @Override
    public <T extends Comparable<T>> boolean isDalend(List<T> rijtje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public <T extends Comparable<T>> boolean isStijgend(List<T> rijtje) {
        if (i < rijtje.size() - 1) {
            if (rijtje.get(i).compareTo(rijtje.get(i+1)) == -1 || rijtje.get(i).compareTo(rijtje.get(i+1)) == 0) {
                i++;
                isStijgend(rijtje);
            }else{
                return isStijgend = false;
            }
        }
        return isStijgend;
    }

    @Override
    public <T extends Comparable<T>> boolean isGelijk(List<T> rijtje) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
