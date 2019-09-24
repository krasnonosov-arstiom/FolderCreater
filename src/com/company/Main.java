package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        int numberOfFolders = 0;

        System.out.print("Введите количество папок: ");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            numberOfFolders = Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int counter = 1;
        while (counter <= numberOfFolders) {
            String path = "D:\\IT-academy\\HomeTask3\\Task3_" + counter;
            new File(path).mkdir();
            counter++;
        }
    }
}
