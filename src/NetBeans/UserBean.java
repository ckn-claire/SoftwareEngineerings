package NetBeans;



/**
* @Description: This is the bean class of users
* @Author: Thomas Andon
* @Date: 2021/3/28
*/
public class UserBean {
    private String name;

    private String id;

    // Only letters and numbers are permitted.
    private String password;

    private String gender;
    private String motto;
    private double height;
    private double weight;
    private int level;

    //The type of this account, 0 is customer, 1 is coach, 2 is gym manager.
    private int type;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMotto() {
        return motto;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }





    //todo 要一个toString方法，存储到文本文档
    //todo 要parseUser 方法，读取文本文档


}
