package seedu.address.model.person;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static seedu.address.testutil.Assert.assertThrows;

import org.junit.jupiter.api.Test;

public class RoleTest {

    @Test
    public void constructor_null_throwsNullPointerException() {
        assertThrows(NullPointerException.class, () -> new Role(null));
    }

    @Test
    public void isValidRole() {
        // null role
        assertThrows(NullPointerException.class, () -> Role.isValidRole(null));

        // valid roles
        assertTrue(Role.isValidRole(""));
        assertTrue(Role.isValidRole(" "));
        assertTrue(Role.isValidRole("Logistics Lead"));
        assertTrue(Role.isValidRole("Any symbols !@#$%^&*()"));
    }
}
