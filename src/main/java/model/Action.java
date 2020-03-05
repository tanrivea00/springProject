package model;

public class Action {
    private String id;
    private String Name,shrt_code;

    public Action()
    {

    }
    public Action(String id, String Name, String shrt_code)
    {
        this.Name=Name;
        this.id=id;
        this.shrt_code=shrt_code;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getShrt_code() {
        return shrt_code;
    }

    public void setShrt_code(String shrt_code) {
        this.shrt_code = shrt_code;
    }


}
