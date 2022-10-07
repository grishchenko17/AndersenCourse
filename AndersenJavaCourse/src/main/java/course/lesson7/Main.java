package course.lesson7;


import java.io.*;



public class Main {
    public static void main(String args[]) throws IOException {

        AppData appData = new AppData();
        appData.createFile();
        appData.readFile();

    }
}


