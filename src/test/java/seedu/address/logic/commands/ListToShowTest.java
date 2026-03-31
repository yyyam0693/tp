package seedu.address.logic.commands;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class ListToShowTest {
    @Test
    public void updateListToShow_argumentsAreNull_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> ListToShow.updateListToShow(null, ListToShow.KEPT_PERSONS));
        assertThrows(NullPointerException.class, () -> ListToShow.updateListToShow(ListToShow.KEPT_PERSONS, null));
    }

    @Test
    public void updateListToShow_oldListIsSameAsPrevious_throwsIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class, () -> ListToShow.updateListToShow(
                ListToShow.SAME_AS_PREVIOUS, ListToShow.KEPT_PERSONS));
    }

    @Test
    public void updateListToShow_argumentsAreValid_success() {
        // newList is not SAME_AS_PREVIOUS
        assertEquals(ListToShow.KEPT_PERSONS,
                ListToShow.updateListToShow(ListToShow.KEPT_PERSONS, ListToShow.KEPT_PERSONS));
        assertEquals(ListToShow.DELETED_PERSONS,
                ListToShow.updateListToShow(ListToShow.KEPT_PERSONS, ListToShow.DELETED_PERSONS));

        // newList is SAME_AS_PREVIOUS
        assertEquals(ListToShow.DELETED_PERSONS,
                ListToShow.updateListToShow(ListToShow.DELETED_PERSONS, ListToShow.SAME_AS_PREVIOUS));
    }
}
