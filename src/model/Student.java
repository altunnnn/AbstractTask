package model;

public class Student extends Customer {
    public Student(String name, int age, String maritalStatus, int fin) {
        super(name, age, maritalStatus, fin);
    }
    Customer myObj = new Customer("altun",18,"evli",12333);

    public Customer getMyObj() {
        String email1 = myObj.email;
        return null;
    }

    @Override
    public int getAge() {
        return super.getAge();
    }
}
