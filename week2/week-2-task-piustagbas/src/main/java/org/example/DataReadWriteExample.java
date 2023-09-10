package org.example;//package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BufferedReadExample {
    public static void main(String[] args) {
        BufferedReader reader = null;

        try {
            // Open the file for reading
            reader = new BufferedReader(new FileReader("/Users/mac/IdeaProjects/WEEK2/src/main/resources/Student.csv"));
//            reader1 = new BufferedReader(new FileReader("/Users/mac/IdeaProjects/WEEK2/src/main/resources/Teacher.csv"));


            String line;

            // Read each line from the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Handle any IO exceptions that may occur
            e.printStackTrace();
        } finally {
            try {
                // Close the BufferedReader in the finally block
                if (reader != null) {
                    reader.close();
                } else {
                    reader.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    }






