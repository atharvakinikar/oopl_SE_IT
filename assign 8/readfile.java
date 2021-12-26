import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class readfile {
    public static void main(String[] args) {
        try {
            File f2 = new File(
                    "C:\\Users\\kinikar\\Desktop\\P.I.C.T\\SEM 3\\OOP LAB\\Assignments\\assign 8\\fileop.txt");
            Scanner reader = new Scanner(f2);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.print("Error occured");
            e.printStackTrace();
        }

    }
}
