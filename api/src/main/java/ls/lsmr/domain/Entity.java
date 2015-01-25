package ls.lsmr.domain;

import java.util.Optional;

public class Entity {
    
    private Integer id = 0;
    
    public Entity() {
        //Empty constructor is used for new Entities that have not been persisted yet (i.e. no DB id)
    }
    
    public Entity(final int id) {
        this.id = id;
    }
    
    public Optional<Integer> getId() {
        if (id == 0) {
            return Optional.empty();
        } else {
            return Optional.of(id);
        }
    }
}
