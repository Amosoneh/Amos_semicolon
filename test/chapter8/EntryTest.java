package chapter8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EntryTest {
    Entry entry;
    Entry entry1;

    @BeforeEach
    void setUp() {
        entry = new Entry("TestTitle", "TestBody");
        entry1 = new Entry("customerId", "testTitle1", "testBody1");
    }

    @Test
    void testThatWeCanCreateEntriesWithAllFields(){

//        Entry entry1 = new Entry("id", "testT", "body");
        assertEquals("TestTitle", entry.getTitle());
        assertEquals("TestBody", entry.getBody());
        assertNotNull(entry.getId());
        assertEquals("customerId", entry1.getId());
    }

    @Test
    void testThatWeCanSetTitleAndBody() {
        entry.setTitle("newTitle");
        entry.setBody("newBody");
        assertEquals("newTitle", entry.getTitle());
        assertEquals("newBody", entry.getBody());
    }

    @Test
    void testThatWeCanValidateEntryParameters() {
        assertThrows(IllegalArgumentException.class,
                () -> new Entry("", "test"));

        assertThrows(IllegalArgumentException.class,
                () -> new Entry("test title", ""));
    }

}