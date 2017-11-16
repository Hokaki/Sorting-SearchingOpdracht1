package nl.hva.dmci.ict.se.datastructures;

/**
 * Genreates dictionaries for languages.
 * 
 * @author Huub van Thienen.
 * @author Nico Tromp
 */
public interface DictionaryGenerator {
    /**
     * Generates all the words that can be construct in the YoLo language that consist of a specific
     * number of syllables.
     * 
     * @param n
     *            defines of how many syllables each words must consist.
     * @return the dictionary containing all the possible words for the YoLo language that are
     *         consist of <code>n</code> syllables of the YoLo language.
     */
    String[] yololian(int n);

    /**
     * Generates all the words for a given set of syllables that consists of a number of syllables.
     * 
     * @param n
     *            defines of how many syllables each words must consist.
     * @param syllables
     *            defines the different syllables of the language.
     * @return the dictionary containing all the possible words that can be constructed using
     *         <code>n</code> syllables as specified by <code>syllables</code>.
     */
    String[] language(int n, String[] syllables);
}
