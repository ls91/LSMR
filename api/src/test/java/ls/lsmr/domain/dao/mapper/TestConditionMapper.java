package ls.lsmr.domain.dao.mapper;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.sql.ResultSet;
import java.sql.SQLException;

import ls.lsmr.domain.Condition;

import org.easymock.EasyMock;
import org.junit.Test;

public class TestConditionMapper {
    
    @Test
    public void mapShouldReturnANewConditionObjectWithIdAndNameSetToThoseInTheResultSet() throws SQLException {
        ResultSet testResultSet = EasyMock.createMock(ResultSet.class);
        EasyMock.expect(testResultSet.getInt("ID")).andReturn(6).once();
        EasyMock.expect(testResultSet.getString("NAME")).andReturn("NAME").once();
        EasyMock.replay(testResultSet);
        
        Condition result = new ConditionMapper().map(0, testResultSet, null);
        assertTrue(result.getId().isPresent());
        assertEquals(new Integer(6), result.getId().get());
        
        assertTrue(result.getName().isPresent());
        assertEquals("NAME", result.getName().get());
        
        EasyMock.verify(testResultSet);
    }
}
