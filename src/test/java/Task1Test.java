import org.junit.Test;

import static org.junit.Assert.*;

public class Task1Test {

    @Test
    public void longestStringWithoutRepeating_null() {
        assertEquals(0, Task1.longestStringWithoutRepeating(null));
    }

    @Test
    public void longestStringWithoutRepeating_spaceIsAlsoCharacter() {
        assertEquals(1, Task1.longestStringWithoutRepeating("   "));
    }

    @Test
    public void longestStringWithoutRepeating_single() {
        assertEquals(1, Task1.longestStringWithoutRepeating("a"));
    }

    @Test
    public void longestStringWithoutRepeating_withSpacesIsAlsoCharacter() {
        assertEquals(2, Task1.longestStringWithoutRepeating(" a "));
    }

    @Test
    public void longestStringWithoutRepeating_singleGap() {
        assertEquals(2, Task1.longestStringWithoutRepeating("ab"));
    }

    @Test
    public void longestStringWithoutRepeating_singleGap_all_the_same() {
        assertEquals(1, Task1.longestStringWithoutRepeating("aa"));
    }

    @Test
    public void longestStringWithoutRepeating_severalGaps_first() {
        assertEquals(3, Task1.longestStringWithoutRepeating("abccb"));
    }

    @Test
    public void longestStringWithoutRepeating_severalGaps_second() {
        assertEquals(3, Task1.longestStringWithoutRepeating("abbac"));
    }

    @Test
    public void longestStringWithoutRepeating_severalCharsRepeated() {
        assertEquals(3, Task1.longestStringWithoutRepeating("abcabcbb"));
    }

    @Test
    public void longestStringWithoutRepeating_severalCharsRepeatedEnd() {
        assertEquals(3, Task1.longestStringWithoutRepeating("pwwkew"));
    }
}