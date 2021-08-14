import java.io.*;
import java.util.*;

public class Signupp
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);    // Scanner to take input for userid and pass
        String user,pass;

//        System.out.println("Press \"ENTER\" to continue...");
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();

        System.out.println("Set Username:");
        user = input.nextLine();

        System.out.println("Set Password:");
        pass = input.nextLine();

        System.out.println("You have successfully signed up");


        //        Creating a new file to store userid and pass info of customers
        File myFile = new File("Information.txt");
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            System.out.println("create new file");
            e.printStackTrace();
        }

        //code to write the scanned input from user in the txt file
        try {
            FileWriter fileWriter = new FileWriter("Information.txt", true);
            fileWriter.write(user);
            fileWriter.write("\n");
            fileWriter.write(pass);
            fileWriter.write("\n");
            fileWriter.close();
//            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
