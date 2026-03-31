package seedu.address.logic.commands;

import static seedu.address.commons.util.CollectionUtil.requireAllNonNull;

/**
 * Describes which list to show after executing a command.
 */
public enum ListToShow {
    KEPT_PERSONS,
    DELETED_PERSONS,
    SAME_AS_PREVIOUS;

    /**
     * Returns which list to show after executing a command.
     *
     * @param oldList List that was shown before executing the command. Cannot be {@code SAME_AS_PREVIOUS}.
     * @param updateInstruction Describes how to change the list that will be shown.
     * @return The new list to show.
     */
    public static ListToShow updateListToShow(ListToShow oldList, ListToShow updateInstruction) {
        requireAllNonNull(oldList, updateInstruction);

        if (oldList == SAME_AS_PREVIOUS) {
            throw new IllegalArgumentException("oldList should not be SAME_AS_PREVIOUS");
        }

        if (updateInstruction == SAME_AS_PREVIOUS) {
            return oldList;
        }
        return updateInstruction;
    }
}
