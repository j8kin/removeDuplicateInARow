import static org.junit.Assert.*;

public class removeDuplicateInARowTest {

    @org.junit.Test
    public void removeDup1() {
        assertEquals("abc", removeDuplicateInARow.removeDup("abc"));
    }

    @org.junit.Test
    public void removeDup2() {
        assertEquals("abc", removeDuplicateInARow.removeDup("aaabc"));
    }

    @org.junit.Test
    public void removeDup3() {
        assertEquals("abc", removeDuplicateInARow.removeDup("abbbc"));
    }

    @org.junit.Test
    public void removeDup4() {
        assertEquals("abc", removeDuplicateInARow.removeDup("abccc"));
    }

    @org.junit.Test
    public void removeDup5() {
        assertEquals("", removeDuplicateInARow.removeDup("aabbcc"));
    }

    @org.junit.Test
    public void removeDup6() {
        assertEquals("b", removeDuplicateInARow.removeDup("baabbcc"));
    }

    @org.junit.Test
    public void removeDup7() {
        assertEquals("", removeDuplicateInARow.removeDup("abccba"));
    }

    @org.junit.Test
    public void removeDup8() {
        assertEquals("", removeDuplicateInARow.removeDup(""));
    }
}