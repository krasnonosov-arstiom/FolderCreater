package com.company;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        int numberOfFolders = 0;
        String path = null;
        int counter = 1;

        System.out.print("Введите количество папок: ");
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            numberOfFolders = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Введите путь или нажмите Enter для выбора пути по умолчанию:");
            
            path = bufferedReader.readLine().equals("") ? "D:\\IT-academy\\HomeTask3\\Task3_" : bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (counter <= numberOfFolders) {
            String pathFinal = path + counter;
            new File(pathFinal).mkdir();
            counter++;
        }
    }
}
