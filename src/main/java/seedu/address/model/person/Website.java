package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

import seedu.address.commons.exceptions.IllegalValueException;

/**
 * Represents a Person's website in teh address book.
 * Guarantees: immutable; is valid as declared
 */
public class Website {
    public static final String MESSAGE_WEBSITE_CONSTRAINS =
            "Website can only contain https/http:// www.";
    public static final String WEBSITE_VALIDATION_REGEX =
            "(https\\:\\/\\/)|(http\\:\\/\\/)|(www\\.)|[a-zA-Z0-9]+\\.[a-zA-Z0-9]+";
    public final String value;

    /**
     *
     */
    public Website(String website)throws IllegalValueException {
        requireNonNull(website);
        String trimmedWebsite = website.trim();
        if (!isValidWebsite(trimmedWebsite)) {
            throw new IllegalValueException(MESSAGE_WEBSITE_CONSTRAINS);
        }

        this.value = website;
    }

    /**
     * Returns true if given string is valid person website
     */
    public static boolean isValidWebsite(String test) {
        return test.matches(WEBSITE_VALIDATION_REGEX);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof Website // instanceof handles nulls
                && this.value.equals(((Website) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
