import model.Customer;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Altun", 18, "evli", 123);
        Customer customer2 = new Customer("Altun2", 18, "evli", 123);
        Customer customer3 = new Customer("Altun3", 18, "evli", 123333);
        Customer customer4 = new Customer("Altun4", 18, "evli", 1263);


        Object[] arrays = {};

        arrays[0] = customer1;

        Customer[] customers = {customer1, customer2, customer3, customer4};
        int[] fins = new int[4];

        Integer score = 0;


        for (Customer customer : customers) {
            score = customer.getAge() > 18 ? 2 : 0;
            score += customer.getMaritalStatus().equals("subay") ? 5 : 2;
        }

        for (int i = 0; i < fins.length; i++) {
            for (Customer customer : customers) {
                if (!(fins[i] == (customer.getFin()))) {
                    fins[i] = customer.getFin();
                }
            }

        }

        Integer age = 100;




//        if (customer1.getFin() == customer2.getFin()) {
//            arrays[1] = customer2;
//        } else if (customer1.getFin() == customer3.getFin()) {
//            arrays[2] = customer3;
//        } else if (customer1.getFin() == customer4.getFin()) {
//            arrays[3] = customer4;
//        }


    }


}


