package Controller;


import java.io.*;
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

    public boolean isValidAccount(String s1, String s2) {
        String line;
        boolean flag;
        try {

             FileReader  fr = new FileReader("Userinfo.txt");

             BufferedReader  br = new BufferedReader(fr);

             while (br.readLine()!=null){
                 line =br.readLine();
                 //line.substring()
             }



        } catch (Exception e) {
        }
        return true;//todo 将数据从文件当中逐行读取并储存为数组或者哈希表，根据输入的id和pw进行遍历循环，匹配是否存在

    }

}
