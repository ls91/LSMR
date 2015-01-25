package ls.lsmr.domain.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import ls.lsmr.domain.Condition;

import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

public class ConditionMapper implements ResultSetMapper<Condition> {
    
    public Condition map(final int index, final ResultSet r, final StatementContext ctx) throws SQLException {
        return new Condition(r.getInt("ID"), r.getString("NAME"));
    }
}
