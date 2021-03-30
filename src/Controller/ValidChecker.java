package Controller;


import java.io.*;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Description: This class contains all methods that checks the validation.
 * @Date: 2021/3/29
 */
public class ValidChecker {
    //todo 所有需要检查的方法都写在这里，比如检查用户名、密码是否符合规范，等等。


    /**
     * @Description: check the input Id and Password
     * @Param:
     * @return:
     * @Author: CloudKing
     * @Date: 2021/3/30
     */
    public boolean isInvalidID(String id) {
        //todo 实现id检查逻辑，只能包括大小写字母和数字，长度在4-15位。
        if (id.length() >= 4 && id.length() <= 15) {
            String regex = "[ _`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！ @#￥%……&*（）——+|{}【】‘；：”“’。，、？]|\n|\r|\t";
            Pattern pattern = Pattern.compile(regex);
            Matcher hasSpecial = pattern.matcher(id);
            if (!hasSpecial.find()) {
                return hasSpecial.find();
            } else {
                return hasSpecial.find();
            }
        } else {
            return true;
        }
    }

    public boolean isInvalidPw(String pw) {
        return isInvalidID(pw);
    }


    public boolean isSameString(String s1, String s2) {
        return s1.equals(s2);
    }
/**
* @Description: Check if the user input is correct (match to the Userinfo.txt)
* @Param:  id,pw
* @return:  True/False
* @Author: CloudKing
* @Date: 2021/3/30
*/
    public boolean isValidAccount(String id, String pw) throws IOException {

        // todo 这里不需要读写文件，读写文件在IOClass就已经完成了，这里只需要比对id和pw是不是在IOClass返回的列表里就行
        /*String[] s = new String[2];
        s[0] = id;
        s[1] = pw;
        //System.out.println(Arrays.toString(s));
        FileReader fr = new FileReader("Userinfo.txt");

        BufferedReader br = new BufferedReader(fr);


        for (String line = br.readLine(); line != null; line = br.readLine()) {
            //System.out.println(line);
            String l = line;
            String[] s1 = l.split(";");
            String[] ID1 = s1[0].split(":");
            //System.out.println(Arrays.toString(s2));
            String[] ID2 = ID1[1].split(",");
            //System.out.println(Arrays.toString(ID2));


            String[] PW1 = s1[1].split(":");
            String[] PW2 = PW1[1].split(",");
            //System.out.println(Arrays.toString(PW2));

            String[] li = concat(ID2, PW2);

            if (Arrays.equals(li, s)) {
                //System.out.println("Login success");
                return true;
            } else {
                break;
            }
        }
           return false;*/
        return false;

    }


    public static String[] concat(String[] a, String[] b) {
        String[] c= new String[a.length+b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }


}
