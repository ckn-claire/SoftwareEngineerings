package Controller;

import NetBeans.User;

import java.io.*;
import java.util.ArrayList;


public class IOClass {

    // This is the path where the test files are.
    String AccountFilePath = "src/Data/Account/account.txt";

    /**
     * This method reads id and password files and parse them.
     *
     * @return An array list with all members ID and passwords.
     * @throws Exception
     */
    public ArrayList readAllAccount() throws Exception {
        File f = new File(AccountFilePath);


        if (!(f.isFile() && f.exists())) {
            System.out.println("Account file doesn't exist");
            return null;
        }
        InputStreamReader isr = new InputStreamReader(new FileInputStream(f));
        BufferedReader br = new BufferedReader(isr);
        String line = null;
        while ((line = br.readLine()) != null) {
            // This is where we process each String line
            System.out.println(line);

        }
        br.close();

        return null;
    }


    public static void main(String[] args) throws Exception {
        new IOClass().readAllAccount();
    }
}
