package telran.data;

public class Cinema {

    private String name;
    private Address address;

    public Cinema(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public class Address{
        private String street;
        private int house;

        public Address(String street, int house) {
            this.street = street;
            this.house = house;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "street='" + street + '\'' +
                    ", house=" + house +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
