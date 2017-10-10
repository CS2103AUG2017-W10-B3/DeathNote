package seedu.address.model.person;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WebsiteTest {

    @Test
    public void isValidWebsite() {
        // Invalid websites
        assertFalse(Website.isValidWebsite("www.yahoo.com"));
        assertFalse(Website.isValidWebsite("website"));

        // Valid websites
        assertTrue(Website.isValidWebsite("https://www.facebook.com"));
        assertTrue(Website.isValidWebsite("https://www.gmail.com"));
        assertTrue(Website.isValidWebsite("https://www.ivle.nus.edu.sg"));
        assertTrue(Website.isValidWebsite("http://code.org"));
    }
}
