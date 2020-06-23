public class Main {

    public static void main(String[] args) {

        System.out.println(vadidatePhoneNumber("023 3945964"));

    }

    public static boolean vadidatePhoneNumber(String number){

        class PhoneNumber{
            private String phoneNumber;

            public PhoneNumber() {
                this.phoneNumber = number;
            }

            private boolean checkCode(){
                if(phoneNumber.charAt(0) == '0' && phoneNumber.indexOf(' ') == 3 &&
                        phoneNumber.substring(0, 3).matches("[0-9]+")){
                    return true;
                }
                return false;
            }

            private boolean checkNumber(){
                if(phoneNumber.length() == 11 && phoneNumber.substring(4).matches("[0-9]+")){
                    return true;
                }
                return false;
            }
        }
        PhoneNumber phoneNumber = new PhoneNumber();

        return phoneNumber.checkCode() && phoneNumber.checkNumber();
    }
}
