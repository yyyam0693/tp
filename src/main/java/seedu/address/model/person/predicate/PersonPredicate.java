package seedu.address.model.person.predicate;

import java.util.function.Predicate;

import seedu.address.model.person.Person;

/**
 * Interface for person-matching predicates that's used by find command.
 */
public interface PersonPredicate extends Predicate<Person> {
}
