package Last_Code_of_CentroWeg_2025_Library;
@SuppressWarnings("all")

public class Reader {
    private int age;
    private String name, sex;


    //constructor method
    public Reader(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }


    //special methods - get and set
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    //specific methods
    public void getOlder() {
        this.age++;
    }
}