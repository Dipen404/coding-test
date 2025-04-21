package com.dipen.coding.test;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test{
    public static void main(String[] args) {
        System.out.println("hello java");
    }
}



 class CSVReader {
    public static void main(String[] args) {
        String filePath = "D:/member_entry.csv";  // Replace with your CSV file path
        System.out.println("file path"+filePath);
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line by commas
                String[] values = line.split(",");

                // Process the values (this just prints them)
                for (String value : values) {
                    System.out.print(value + " ");
                }
                System.out.println(); // Newline after each row
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

