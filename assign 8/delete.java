import java.io.File;

public class delete {
    public static void main(String[] args) {
        File f3 = new File("C:\\Users\\kinikar\\Desktop\\P.I.C.T\\SEM 3\\OOP LAB\\Assignments\\assign 8\\fileop.txt");
        if (f3.delete()) {
            System.out.println(f3.getName() + " Deleted successfully");
        } else {
            System.out.println("Error in deleting the file");
        }
    }
}
