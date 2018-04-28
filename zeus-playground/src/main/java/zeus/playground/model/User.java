package zeus.playground.model;

/**
 * @author: KG
 * @description:
 * @date: Created in 上午10:09 2018/4/28
 * @modified by:
 */

public class User {
    private int id;
    private String name;

    public User() {
        this.id = 0;
        this.name = "0";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + "]";
    }
}
