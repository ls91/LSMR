package ls.lsmr.domain;

import java.util.Optional;

public class Condition extends Entity {
    
    private String name;
    
    public Condition(final String name) {
        this.name = name;
    }
    
    public Condition(final int id, final String name) {
        super(id);
        this.name = name;
    }
    
    public Optional<String> getName() {
        if (name == null) {
            return Optional.empty();
        } else {
            return Optional.of(name);
        }
    }
}
