package ls.lsmr.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestEntity {
    
    @Test
    public void shouldBeAbleToCreateEntityWithNoArgConstructorAndGetEmptyOptionalOnId() {
        Entity testEntity = new Entity();
        assertFalse(testEntity.getId().isPresent());
    }
    
    @Test
    public void shouldBeAbleToSetAndGetIdViaConstructorAndGetter() {
        Entity testEntity = new Entity(5);
        assertTrue(testEntity.getId().isPresent());
        assertEquals(new Integer(5), testEntity.getId().get());
    }
}
