import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private List<String> createList(String... elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }

    @Test
    void everyStatementAndEveryBranchTest() {
        IllegalArgumentException exception;
        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList()));
        assertTrue(exception.getMessage().contains("List length should be greater than 0"));

        exception = assertThrows(IllegalArgumentException.class, () -> SILab2.function(createList("0", "#", "0")));
        assertTrue(exception.getMessage().contains("List length should be a perfect square"));

        List<String> expected = new ArrayList<>(Arrays.asList("2", "#", "#", "1", "#", "4", "#", "1", "3", "#", "2", "0", "#", "#", "1", "0"));
        assertEquals(expected, SILab2.function(createList("0", "#", "#", "0", "#", "0", "#", "0", "0", "#", "0", "0", "#", "#", "0", "0")));
    }
}