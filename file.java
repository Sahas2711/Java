import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.sql.rowset.serial.SQLOutputImpl;

@SuppressWarnings("unused")
public class file {
    public static void main(String[] args) {

        // Creation
        File myfile = new File("sahas.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("unable to create a file ");
            e.printStackTrace();
        }

        // write a file
        try {
            FileWriter filewriter = new FileWriter("sahas.txt");
            filewriter.write("Hi this is sahas\n prakash\n nagar");
            filewriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scan = new Scanner("sahas");
        File myFile = new File("sahas.txt");
        try {
            while (scan.hasNext("sahas")) {
                String line = scan.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        File.close();
        scan.close();

    }
}
