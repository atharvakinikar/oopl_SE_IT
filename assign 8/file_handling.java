import java.io.*;
import java.util.*;

public class file_handling {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void addRecords() throws IOException {
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("st.txt", true)));
        String name, address;
        int studentid, rollno, Class;
        float marks;
        String s;
        boolean addmore = false;

        do {
            System.out.println("Enter Student name:");
            name = br.readLine();

            System.out.println("Student ID:");
            studentid = Integer.parseInt(br.readLine());

            System.out.println("Roll No:");
            rollno = Integer.parseInt(br.readLine());

            System.out.println("Address :");
            address = br.readLine();

            System.out.println("Class:");
            Class = Integer.parseInt(br.readLine());

            System.out.println("Marks:");
            marks = Float.parseFloat(br.readLine());

            pw.println(
                    name + "\t\t" + studentid + "\t\t" + rollno + "\t\t" + address + "\t\t" + Class + "\t\t" + marks);

            System.out.println("\nRecord added successfully.!\nDo you want to add more records? (Y/N):");
            s = br.readLine();
            if (s.equalsIgnoreCase("Y")) {
                addmore = true;
                System.out.println();
            } else
                addmore = false;

        } while (addmore);
        pw.close();
        showMenu();
    }

    public void readRecords() throws IOException {

    }

    public static void main(String[] args) {

    }
}
