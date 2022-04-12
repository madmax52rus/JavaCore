package homework5;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("homework5/file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        AppData appData = new AppData();
        appData.readSomeValues("file.txt");

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.toString(appData.getData()));

        AppData.writeSomeValues("file2.txt");
    }
}
