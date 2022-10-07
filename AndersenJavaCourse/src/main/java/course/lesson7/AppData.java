package course.lesson7;

import java.io.*;

public class AppData {

    public void createFile() throws IOException {


        StringBuilder builder = new StringBuilder();
        String[] header = new String[]{"First", "Second", "Third"};
        for (int i = 0; i < header.length; i++) {
            builder.append(header[i]);
            builder.append(";");
        }
        builder.append("\n");

            int[][] data = {{1, 2, 3},
                    {20, 30, 40},
                    {300, 400, 500},
            };
            for (int k = 0; k < data.length; k++) {
                for (int j = 0; j < data.length; j++) {
                    builder.append(data[k][j] + "");
                    if (j < data.length - 1)
                        builder.append(";");
                }
                builder.append("\n");
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter("createFile.csv"));
            writer.write(builder.toString());
            writer.close();

        }

    public void readFile() {
        String sample = ";";
        String mystring;
        try {
            BufferedReader br = new BufferedReader(new FileReader("/Users/maryiahryshchanka/Documents/readingFile.csv"));
            while ((mystring = br.readLine()) != null) {
                String[] employee = mystring.split(sample);
                System.out.println("ID: " + employee[0] + ", Name: " + employee[1] + ", LastName: " + employee[2] + ", Phone: " + employee[3]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



