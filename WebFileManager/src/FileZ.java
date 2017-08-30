/**
 * Created by eastquadro on 14.07.2017.
 */
public class FileZ {
     String father;
     String name;

    public FileZ(String father, String name)
    {
        this.father = father;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFather() {
        return father;
    }


    public void setFather(String father) {
        this.father = father;
    }

    public void setName(String name) {
        this.name = name;
    }
}
