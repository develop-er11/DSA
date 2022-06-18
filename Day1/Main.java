public class Main {
    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyRightChar = '\u00A9';
        System.out.println(myCopyRightChar);

        boolean myTureBoolValue = true;
        boolean myFalseBoolValue = false;

        String myString = "This is a string";
        myString = myString + "\u00A9 2022";
        System.out.println(myString);
    }
}