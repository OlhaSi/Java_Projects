public class PhoneValidator {

    public void validatePhoneNumber() {

        int numberLenght = 10;

        class PhoneNumber {

            public PhoneNumber() {

            }

            public void validNumber(String phoneNumber) {
                for (int i = 0; i < numberLenght; i++) {
                    if (phoneNumber.length() <= numberLenght)
                        System.out.print(phoneNumber + " is valid mobile number");
                    else if (phoneNumber.charAt(i) == phoneNumber.charAt(' '))
                        System.out.print(phoneNumber + " is valid mobile number");
                    else
                        System.out.print(phoneNumber + " is invalid mobile number");

                    System.out.println();
                }
            }
        }

        PhoneNumber num = new PhoneNumber();
        num.validNumber("176 343575");
    }
}
