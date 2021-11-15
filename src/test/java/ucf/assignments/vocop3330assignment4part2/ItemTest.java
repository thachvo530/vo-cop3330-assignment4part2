package ucf.assignments.vocop3330assignment4part2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    private Item item;

    @BeforeEach
    void setUp() {
        item = new Item("Test", "Item used for testing", "2021-11-14", "Complete");
    }

    @Test
    void getName() {
        String name = item.getName();
        String testname = "Test";

        assertEquals(name, testname);

    }

    @Test
    void setName() {

        item.setName("Test2");
        String name = item.getName();

        String testName = "Test2";

        assertEquals(testName, name);
    }

    @Test
    void getDescription() {

        String description = item.getDescription();

        String testDesc = "Item used for testing";

        assertEquals(testDesc, description);
    }

    @Test
    void setDescription() {

        item.setDescription("Set to something new");

        String description = item.getDescription();

        String testDesc = "Set to something new";

        assertEquals(testDesc, description);
    }

    @Test
    void getDate() {

        String testDate = "2021-11-14";

        assertEquals(testDate, item.getDate());
    }

    @Test
    void setDate() {

        item.setDate("2021-11-15");

        String date = item.getDate();

        String testDate = "2021-11-15";

        assertEquals(testDate, date);
    }

    @Test
    void getStatus() {
        String testStatus = "Complete";

        assertEquals(testStatus, item.getStatus());
    }

    @Test
    void setStatus() {

        item.setStatus("Incomplete");

        String testStatus = "Incomplete";

        assertEquals(testStatus, item.getStatus());
    }
}