package homework5;

import com.sun.org.apache.xpath.internal.operations.String;

import java.io.*;
import java.util.ArrayList;


public class AppData {

    private String fileName;
    private java.lang.String[] header;
    private static Integer[][] data;

    public AppData() throws FileNotFoundException {
        this.header = header;
        this.data = data;
    }



    public java.lang.String[] getHeader() {
        return header;
    }

    public void setHeader(java.lang.String[] header) {
        this.header = header;
    }

    public Integer[][] getData() {
        return data;
    }

    public void setData(Integer[][] data) {
        this.data = data;
    }

        public void readSomeValues(java.lang.String fileName) {
        ArrayList<java.lang.String> someValueList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("homework5/file.txt"))) {
            java.lang.String tempString;

            while ((tempString = bufferedReader.readLine()) != null) {
                header = bufferedReader.readLine().split(";");
                someValueList.add(tempString);
            }

            data = someValueList.toArray(new Integer[][]{{}});
        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeSomeValues(java.lang.String s) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("file2.txt"))) {
            for (Integer[] row : data) {
               bufferedWriter.write(java.lang.String.valueOf(row));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

