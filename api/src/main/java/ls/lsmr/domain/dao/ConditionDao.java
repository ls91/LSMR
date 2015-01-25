package ls.lsmr.domain.dao;

import java.util.List;

import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.customizers.RegisterMapper;

import ls.lsmr.domain.Condition;
import ls.lsmr.domain.dao.mapper.ConditionMapper;

@RegisterMapper(ConditionMapper.class)
public interface ConditionDao {
    
    @SqlQuery("SELECT id, name FROM conditions")
    public List<Condition> getConditions();
    
    public void close();
}
