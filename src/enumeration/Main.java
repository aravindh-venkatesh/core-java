package enumeration;

public class Main {
    public static void main(String[] args) {
        System.out.println(Month.valueOf("FEBRUARY"));
        System.out.println("-----------------------");

        for (Month month : Month.values()) {
            System.out.println(month.toString() + " has " + month.getNumberOfDays() + " days in a month");
            System.out.println(month.toString() + "s ordinal value in enumeration is " + month.ordinal());
            System.out.println();
        }
        System.out.println("-----------------------");

        Month month1, month2, month3;
        month1 = Month.JANUARY;
        month2 = Month.FEBRUARY;
        month3 = Month.MARCH;
        System.out.println(month1.compareTo(month2));
        System.out.println(month2.compareTo(month2));
        System.out.println(month3.compareTo(month2));
        System.out.println("-----------------------");

        System.out.println(month2.equals(month2));
        System.out.println(month2.equals(month1));
    }
}
