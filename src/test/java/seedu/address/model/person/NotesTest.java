package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class NotesTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Notes(null));
    }

    @Test
    public void isValidNotes() {
        // null notes
        assertThrows(NullPointerException.class, () -> Notes.isValidNotes(null));

        // valid notes
        assertTrue(Notes.isValidNotes(""));
        assertTrue(Notes.isValidNotes("Available on weekends only"));
        assertTrue(Notes.isValidNotes("Prefers phone contact.\nCan cover late shifts."));
    }
}
