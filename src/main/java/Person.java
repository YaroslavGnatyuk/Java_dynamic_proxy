/**
 * Created by yaroslav on 03.03.16.
 */
public class Person implements IPerson {
    String name ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void rename(String new_name) {
        if(!this.name.equals(new_name))
            this.name = new_name;
    }
}
