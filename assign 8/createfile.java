import java.io.File;
import java.io.IOException;

class createfile {
    public static void main(String[] args) {
        try {
            File f0 = new File(
                    "C:\\Users\\kinikar\\Desktop\\P.I.C.T\\SEM 3\\OOP LAB\\Assignments\\assign 8\\fileop.txt");
            if (f0.createNewFile())
                System.out.println("File " + f0.getName() + " is created successfully");
            else
                System.out.println("File creation failed");
        } catch (IOException e) {
            System.out.println("Unexpected error occured");
            e.printStackTrace();
        }
    }
}
