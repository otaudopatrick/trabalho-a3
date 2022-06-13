package com.trabalhoa3.delivery.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileIO {
    private static final String COMMA_DELIMITER = ",";

    public static void writeFile(Path filePath, String[] data) {
        try (BufferedWriter writer = Files.newBufferedWriter(filePath,
                StandardCharsets.UTF_8, StandardOpenOption.CREATE,
                StandardOpenOption.WRITE, StandardOpenOption.APPEND)) {
            writer.write(ConvertToCsv.convert(data));
            writer.write("\n");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static List<List<String>> readFile(String filePath)
            throws FileNotFoundException, IOException {
        File file = new File(filePath);

        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                if (count == 0) {
                    count++;
                    continue;
                }
                String[] values = line.split(COMMA_DELIMITER);
                records.add(Arrays.asList(values));
                count++;
            }
        }
        return records;
    }
}
