package exercises.technology;

import java.util.Date;

public abstract class AbstractEntity {

    private long id;

    public AbstractEntity(){
        Date date = new Date();
        id = date.getTime();
    }

    public long getId() {
        return this.id;
    }
}
