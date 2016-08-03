/**
 * Created by mills on 8/3/16.
 */
public class PhoneNumber {

    private final String number;

    public PhoneNumber (String number) {
        this.number = this.cleanNumber(number);
    }

    public String getNumber () {
        return this.number;
    }

    public String cleanNumber (String number) {

        //Remove parens, dashes, periods, and spaces from number
        number = number.replaceAll("[\\Q][()-. \\E]", "");

        if (!number.matches("^[0-9]+$")) {// if string is not all digits
            return "0000000000";
        }
        else if (number.length() == 10) {// if string is has no leading 1
            return number;
        }
        else if (number.length() == 11 && number.charAt(0) == '1') { // if string has a leading 1
            return number.substring(1);
        }
        else {
            return "0000000000";
        }
    }

    public String pretty() {
        return "";
    }

    public String getAreaCode() {
        return number.substring();
    }
}
