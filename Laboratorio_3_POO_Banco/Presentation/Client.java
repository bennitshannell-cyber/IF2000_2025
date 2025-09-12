package Laboratorio_3_POO_Banco.Presentation;

public class Client {
    private String name;
    private String lastname;
    private String id;
    private double phone;
    private String address;

    public Client(String name, String lastname, String id, double phone, String address) {
        this.name = name;
        this.lastname = lastname;
        this.id = id;
        this.phone = phone;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getId() {
        return id;
    }

    public double getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
}