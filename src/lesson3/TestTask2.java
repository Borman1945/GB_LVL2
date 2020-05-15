package lesson3;

public class TestTask2 {

    public static void main(String... args) {

        TelephoneDirectory.addNewPhone("89898989891", "Mishka");
        TelephoneDirectory.addNewPhone("89498989891", "Moshka");
        TelephoneDirectory.addNewPhone("99999999999", "Moshka");
        TelephoneDirectory.addNewPhone("234326553426","Moshka");
        TelephoneDirectory.addNewPhone("234326553426","Artur");
        TelephoneDirectory.addNewPhone("23423556677663245","Mishka");
        TelephoneDirectory.addNewPhone("2345435346","Artur");



        TelephoneDirectory.getPhones("Artur");
    }

}
