package _01_app_start;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter for base converting");
        System.out.println("Version 1.0");
        double kms = 26;
        double milesRes = convertKmsToMiles(kms);
        System.out.println(milesRes + " miles in " + kms + " kms.");
    }
    private static double convertKmsToMiles(double kms) {
        return kms / 1.60934;
    }
}