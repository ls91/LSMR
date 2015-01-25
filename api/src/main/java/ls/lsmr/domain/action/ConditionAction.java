package ls.lsmr.domain.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import ls.lsmr.domain.Condition;
import ls.lsmr.domain.dao.ConditionDao;

import org.skife.jdbi.v2.DBI;

public class ConditionAction extends Action {
    
    protected static Optional<ConditionDao> getDao() {
        Optional<DBI> dbi = getDbi();
        if (dbi.isPresent()) {
            return Optional.of(dbi.get().open(ConditionDao.class));
        } else {
            return Optional.empty();
        }
    }
    
    public List<Condition> getConditions() {
        Optional<ConditionDao> dao = getDao();
        
        List<Condition> result;
        if (dao.isPresent()) {
            result = dao.get().getConditions();
            dao.get().close();
        } else {
            result = new ArrayList<Condition>();
        }
        
        return result;
    }
}
