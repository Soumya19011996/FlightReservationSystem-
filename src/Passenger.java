public class Passenger {
    private static int idCounter;
    private int id;
    private Address address;
    private Contact contact;

    static {
        idCounter = 0;
    }

    public Passenger(int id, String addressStreet, String addressCity,
                     String addressState, String contactName, String contactPhone,
                     String contactEmail) {
        this.id = ++idCounter;
        this.address = new Address(addressStreet, addressCity, addressState);
        this.contact = new Contact(contactName, contactPhone, contactEmail);
    }
    public int getPassengerCount(){
        return idCounter;
    }


    public class Contact{
        private String name;
        private String phone;
        private String email;

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public String getEmail() {
            return email;
        }

        public Contact(String name, String phone, String email){
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
        public String getContactDetails(){
            return contact.name+","+ contact.phone+"," + contact.email;
        }
        public void updateContatDetails(String name,String phone,String email){

            this.name = name;
            this.phone = phone;
            this.email = email;

        }

    }


    public class Address {
             private String street;
             private String city;

             public String getStreet() {
                 return street;
             }

             public String getCity() {
                 return city;
             }

             public String getState() {
                 return state;
             }

             private String state;
             public Address (String street,String city,String state){
                 this.street= street;
                 this.city = city;
                 this.state = state;
             }
                    public String getDetails(){
                        return this.street+","+ this.city+"," + this.state;
                    }
                    public void updateAddressDetails(String addressDetail){

                    }
         }


    public int getId() {
        return id;
    }



    public Address getAddress() {
        return address;
    }

    public static int getCount() {
        return idCounter;
    }

    public Contact getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "contact=" + contact +
                '}';
    }
}

