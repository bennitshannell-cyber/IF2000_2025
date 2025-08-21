package Domain;

public class Persona {
    
    // Attributes
    private String name;
    private String lastname;
    private String id;
    private String phone;
    private int age;

    // Constructor
    public Persona(String name, String lastname, String id, String phone, int age) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.phone = phone;
        this.age = age;
    }

    public Persona() {
        this.name = "";
        this.lastname = "";
        this.id = "";
        this.phone = "";
        this.age = 0;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Persona{" +
                "name = '" + name + '\'' +
                ", lastname = '" + lastname + '\'' +
                ", id = '" + id + '\'' +
                ", phone = '" + phone + '\'' +
                ", age = " + age +
                '}';
    }
}