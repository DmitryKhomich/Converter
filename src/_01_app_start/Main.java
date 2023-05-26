package _01_app_start;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter for base converting");
        System.out.println("Version 1.0");
    }

    private static double convertMilesToKms(double miles) {
        return miles * 1.60934;
    }

    private static double convertKmsToMiles(double kms) {
        return kms / 1.60934;
    }
}