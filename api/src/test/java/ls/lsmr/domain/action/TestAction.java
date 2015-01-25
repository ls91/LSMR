package ls.lsmr.domain.action;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import ls.lsmr.domain.action.Action;

import org.junit.Test;

public class TestAction {
    
    @Test
    public void settingUrlAsNullShouldReturnAnEmptyOptional() {
        Action.setUrl(null);
        assertFalse(Action.getUrl().isPresent());
    }
    
    @Test
    public void settingUrlAsNonNullShouldReturnAnOptionalWithTheStringWithin() {
        Action.setUrl("URL");
        assertTrue(Action.getUrl().isPresent());
        assertEquals("URL", Action.getUrl().get());
    }
    
    @Test
    public void getDbiShouldReturnEmptyOptionalIfUrlHasNotBeenSet() {
        Action.setUrl(null);
        assertFalse(Action.getDbi().isPresent());
    }
    
    @Test
    public void getDbiShouldReturnDbiObjectWithUrlSetIfUrlIsPresent() {
        Action.setUrl(null);
        assertFalse(Action.getDbi().isPresent());
        Action.setUrl("url");
        assertTrue(Action.getDbi().isPresent());
    }
}
