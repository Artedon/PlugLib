package nl.pluglib.util;

import java.text.DecimalFormat;

public class Format {
    public static String f(double value) {
        String[] arr = {"", "k", "M", "B", "T", "Q", "QT", "Sx"};
        int index = 0;
        while ((value / 1000) >= 1) {
            value = value / 1000;
            index++;
        }
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return String.format("%s%s", decimalFormat.format(value), arr[index]);
    }
}
