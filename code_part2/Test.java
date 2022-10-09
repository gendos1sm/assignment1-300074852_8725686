public class Test {

    public static void main (String[] args) {

        Address address1 = new Address();
        Address address2 = new Address("King Edward", 800, "K1N6N5");
        address1.setStreet("Queen");
        address1.setNumber(48);
        address1.setPostal("K1P1N2");

        System.out.println(address1);
        System.out.println(address2);

        Address[] addresses = new Address[6];
        addresses[0] = address1;
        addresses[1] = address2;

        Employee o1 = new Employee("Falcao", 40, 15.50, addresses);

        System.out.println(o1);


    }
}
