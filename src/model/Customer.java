package model;

import service.Voteable;

public class Customer extends Voteable {
    private String name;


    private int age;
    private String maritalStatus;
    private int fin;

    public Customer(String name, int age, String maritalStatus, int fin) {
        this.name = name;
        this.age = age;
        this.maritalStatus = maritalStatus;
        this.fin = fin;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    @Override
    public Boolean canVote() {
        return true;
    }

    protected String email = "john@doe.com";

}




