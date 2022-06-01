package main.java.com.trabalhoa3.delivery.util;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertToCsv {

    public static String convert(String[] data) {
        return Stream.of(data)
                .map(ConvertToCsv::escapeSpecialCharacters)
                .collect(Collectors.joining(","));
    }

    public static String escapeSpecialCharacters(String data) {
        String escapedData = data.replaceAll("\\R", " ");
        if (data.contains(",") || data.contains("\"") || data.contains("'")) {
            data = data.replace("\"", "\"\"");
            escapedData = "\"" + data + "\"";
        }
        return escapedData;
    }
}
