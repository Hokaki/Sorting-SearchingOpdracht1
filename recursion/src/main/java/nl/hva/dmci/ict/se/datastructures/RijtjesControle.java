package nl.hva.dmci.ict.se.datastructures;

import java.util.List;

/**
 * <code>RijtjesControle</code> bepaald of een lijst van <code>Comparable</code> elementen dalend,
 * stijgend of gelijk is. Lege rijen zijn niet dalend, stijgend of gelijk.
 * 
 * @author Nico Tromp
 */
public interface RijtjesControle {
    /**
     * Bepaald of een rij dalend is. Een niet lege rij is dalend als ieder element groter is dan het
     * direct daarop volgende element.
     * 
     * @param rijtje
     *            de rij waarvan bepaald moet worden of deze dalend is.
     * @return <code>true</code> als ieder element groter is dan het direct daarop volgende element,
     *         anders <code>false</code>.
     */
    <T extends Comparable<T>> boolean isDalend(List<T> rijtje);

    /**
     * Bepaald of een rij stijgend is. Een niet lege rij is stijgend als ieder element kleiner is
     * dan het direct daarop volgende element.
     * 
     * @param rijtje
     *            de rij waarvan bepaald moet worden of deze stijgend is.
     * @return <code>true</code> als ieder element kleiner is dan het direct daarop volgende
     *         element, anders <code>false</code>.
     */
    <T extends Comparable<T>> boolean isStijgend(List<T> rijtje);

    /**
     * Bepaald of een rij gelijke elementen bevat. Een niet lege rij is bevat gelijke elementen als
     * ieder element gelijk is aan het direct daarop volgende element.
     * 
     * @param rijtje
     *            de rij waarvan bepaald moet worden of deze stijgend is.
     * @return <code>true</code> als ieder element gelijk is aan het direct daarop volgende element,
     *         anders <code>false</code>.
     */
    <T extends Comparable<T>> boolean isGelijk(List<T> rijtje);
}
