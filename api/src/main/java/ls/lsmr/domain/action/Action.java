package ls.lsmr.domain.action;

import java.util.Optional;

import org.skife.jdbi.v2.DBI;

public abstract class Action {
    
    private static Optional<String> url = Optional.empty();
    
    public static void setUrl(final String url) {
        if (url == null) {
            Action.url = Optional.empty();
        } else {
            Action.url = Optional.of(url);
        }
    }
    
    public static Optional<String> getUrl() {
        return url;
    }
    
    protected static Optional<DBI> getDbi() {
        if (url.isPresent()) {
            return Optional.of(new DBI(url.get()));
        } else {
            return Optional.empty();
        }
    }
}
