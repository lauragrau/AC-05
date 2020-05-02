package cat.udl.tidic.amd.dam_basictesting;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

public class LoginUtilsTest {

    @Test
    public void validGmailAddressPasses() throws Exception {
        assertTrue(LoginUtils.isValidGmailAddress("xxx@gmail.com"));
    }

    @Test
    public void invalidGmailAddressFails() throws Exception {
        assertFalse(LoginUtils.isValidGmailAddress("xxx@kk.com"));
    }

    @Test
    public void invalidAddressFails() throws Exception {
        assertFalse(LoginUtils.isValidEmailAddress("xxx"));
    }

    @Test
    public void validUsernamePasses() throws Exception {
        assertTrue(LoginUtils.getUserName("xxx"));
        assertTrue(LoginUtils.getUserName("hhh"));
    }



}
