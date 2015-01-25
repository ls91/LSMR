package ls.lsmr.domain.action;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import ls.lsmr.domain.dao.ConditionDao;

import org.junit.Before;
import org.junit.Test;

public class TestConditionAction {
    
    @Before
    public void setup() {
        
    }
    
    @Test
    public void getDaoShouldReturnAnEmptyOptionalIfDbiIsNotPresent() {
        ConditionAction.setUrl(null);
        assertFalse(ConditionAction.getDao().isPresent());
    }
    
    @Test
    public void getDaoShouldReturnAConditionDaoIfDbiIsPresent() {
        ConditionAction.setUrl("URL");
        assertTrue(ConditionAction.getDao().isPresent());
        assertTrue(ConditionAction.getDao().get() instanceof ConditionDao);
    }
    
    @Test
    public void getConditionsShouldReturnAnEmptyListIfGetDaoIsEmpty() {
        ConditionAction.setUrl(null);
        assertFalse(ConditionAction.getDao().isPresent());
        assertEquals(0, new ConditionAction().getConditions().size());
    }
    
    @Test
    public void getConditionsShouldReturnAnEmptyListIfGetDaoIsNotEmpty() {
        ConditionAction.setUrl("jdbc:h2:mem:test");
        assertTrue(ConditionAction.getDao().isPresent());
        assertEquals(0, new ConditionAction().getConditions().size());
    }
}
