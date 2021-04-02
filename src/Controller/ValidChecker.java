package Controller;


import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
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
     * @return: boolean
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




    public boolean isValidAccount(String id, String pw) throws Exception {

        // Instantiate an all-accounts hashmap, it contains all accounts.
        HashMap accounts = new IOClass().readAllAccount();


        // if there is no such ID, then false is returned.
        if (!accounts.containsKey(id)){
            return false;
        }

        // there is this ID, but the pw is wrong. false is returned.
        if (!pw.equals(accounts.get(id))) {
            return false;
        }

        return true;
    }

    public static String[] concat(String[] a, String[] b) {
        String[] c= new String[a.length+b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        return c;
    }


}
