package telran.data;

public class Kino {

    String name;
    String street;
    int house;

    public Kino(String name, String street, int house) {
        this.name = name;
        this.street = street;
        this.house = house;
    }

    public interface AddressContainer{
        String getStreet();
        int getHouse();
    }

    public AddressContainer getAddressContainer(){
        class KinoAddressContainer implements AddressContainer{
            String street = Kino.this.street;
            int house = Kino.this.house;

            @Override
            public String getStreet() {
                return this.street;
            }

            @Override
            public int getHouse() {
                return this.house;
            }
        }
        return new KinoAddressContainer();
    }
}
