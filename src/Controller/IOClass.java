package Controller;

import java.io.*;
import java.util.HashMap;


public class IOClass {

    // This is the path where the test files are.
    String userAccountFilePath = "src/Data/Account/account.txt";
    String coachAccountFilePath = "src/Data/Account/CoachAccounts.txt";
    String adminAccountFilePath = "src/Data/Account/AdminAccounts.txt";

    /**
     * This method reads id and password files and parse them.
     *
     * @return An array list with all members ID and passwords.
     * @throws Exception
     * @author Thomas Andon
     */
    public HashMap readAllAccount() throws Exception {

        return getHashMap(userAccountFilePath);
    }

    public HashMap readAllAccount(String path) throws Exception{

        return getHashMap(path);
    }

    /**
     * Encapsulated in readAllAccount() methods, return the Hashmap with dictated files.
     * @param path
     * @return
     * @throws IOException
     */
    public HashMap getHashMap(String path) throws IOException {
        HashMap<String, String> account = new HashMap<>();


        File f = new File(path);
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
     * @return false if exists, true if OK.
     * @throws IOException
     */
    public boolean writeNewUser(String id, String pw) throws Exception {
/*        File f = new File(accountFilePath);
        if (!(f.isFile() && f.exists())) {
            System.out.println("Writing - Account file doesn't exist, new one created");
        }

        if (new ValidChecker().checkIDExists(id)) {
            return false;
        }

        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(f,true));
        BufferedWriter bw = new BufferedWriter(out);
        out.write(id+" " + pw + " " + "#\n");
        bw.close();
        return true;*/

        return writeAccounts(coachAccountFilePath, id, pw);

    }

    public boolean writeNewUser(String path, String id, String pw) throws Exception {
        return writeAccounts(path, id, pw);
    }


    /**
     * Encapsulated in writeAccounts() methods.
     * @param path filepath
     * @param id coach/admin ID
     * @param pw coach/admin pw
     * @return  whether writing succeeded.
     * @throws Exception
     */
    public boolean writeAccounts(String path, String id, String pw) throws Exception {
        File f = new File(path);
        if (!(f.isFile() && f.exists())) {
            System.out.println("Writing - Account file doesn't exist, new one created");
        }

        if (new ValidChecker().checkIDExists(id)) {
            return false;
        }

        OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(f,true));
        BufferedWriter bw = new BufferedWriter(out);
        out.write(id+" " + pw + " " + "#\n");
        bw.close();
        return true;
    }








    public static void main(String[] args) throws Exception {
        new IOClass().readAllAccount();
    }
}
