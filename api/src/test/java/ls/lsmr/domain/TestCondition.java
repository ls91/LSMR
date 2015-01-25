package ls.lsmr.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestCondition {
    
    @Test
    public void shouldBeAbleToCreateEntityWithOneArgConstructorAndGetEmptyOptionalOnId() {
        Condition testCondition = new Condition("CONDITION");
        assertFalse(testCondition.getId().isPresent());
    }
    
    @Test
    public void shouldBeAbleToCreateEntityWithOneArgConstructorAndGetNameReturned() {
        Condition testCondition = new Condition("CONDITION");
        assertTrue(testCondition.getName().isPresent());
        assertEquals("CONDITION", testCondition.getName().get());
    }
    
    @Test
    public void shouldBeAbleToCreateEntityWithTwoArgConstructorAndGetIdAndNameReturned() {
        Condition testCondition = new Condition(5, "CONDITION");
        
        assertTrue(testCondition.getId().isPresent());
        assertEquals(new Integer(5), testCondition.getId().get());
        
        assertTrue(testCondition.getName().isPresent());
        assertEquals("CONDITION", testCondition.getName().get());
    }
}
