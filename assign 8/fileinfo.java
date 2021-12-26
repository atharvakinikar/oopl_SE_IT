import java.io.File;

public class fileinfo {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\kinikar\\Desktop\\P.I.C.T\\SEM 3\\OOP LAB\\Assignments\\assign 8\\fileop.txt");
        if (f1.exists()) {
            System.out.println("The name of file is : " + f1.getName());
            System.out.println("The absolute path of file is : " + f1.getAbsolutePath());
            System.out.println("Is file writeable? : " + f1.canWrite());
            System.out.println("Is file readable? : " + f1.canRead());
            System.out.println("Size of file in bytes : " + f1.length());
        } else
            System.out.println("File does not exist");
    }
}
