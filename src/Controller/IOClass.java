package Controller;

import NetBeans.User;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class IOClass {

    // This is the path where the test files are.
    String AccountFilePath = "src/Data/Account/account.txt";

    /**
     * This method reads id and password files and parse them.
     *
     * @return An array list with all members ID and passwords.
     * @throws Exception
     * @author Thomas Andon
     */
    public HashMap readAllAccount() throws Exception {

        HashMap<String, String> account = new HashMap<>();


        File f = new File(AccountFilePath);
        if (!(f.isFile() && f.exists())) {
            System.out.println("Reading - Account file doesn't exist");
            return null;
        }
        InputStreamReader isr = new InputStreamReader(new FileInputStream(f));
        BufferedReader br = new BufferedReader(isr);
        String line = null;
        while ((line = br.readLine()) != null) {

            // This is where we process each String line
            String[] res = line.split("\\s+");
            account.put(res[0], res[1]);


        }
        br.close();

        return account;
    }


    /**
     * This methods write new account into the file
     * @param id user id
     * @param pw user password
     * @author Thomas Andon
     * @return -2 if the file process failed; -1 if ID exists; 1 for success.
     * @throws IOException
     */
    public boolean writeNewUser(String id, String pw) throws Exception {
        File f = new File(AccountFilePath);
        if (!(f.isFile() && f.exists())) {
            System.out.println("Writing - Account file doesn't exist, new one created");
        }

        if (new IOClass().checkIDExists(id)) {
            return false;
        }

        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(f,true));
        BufferedWriter bw = new BufferedWriter(out);
        out.write(id+" " + pw + " " + "#\n");
        bw.close();
        return true;
    }



    public boolean checkIDExists(String id) throws Exception {
        HashMap accounts = new IOClass().readAllAccount();
        if (accounts.containsKey(id)) {
            return true;
        }
        return false;
    }





    public static void main(String[] args) throws Exception {
        new IOClass().readAllAccount();
    }
}
