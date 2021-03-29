package Controller;


/**
 * @Description: This class contains all methods that checks the validation.
 * @Date: 2021/3/29
 */
public class ValidChecker {
    //todo 所有需要检查的方法都写在这里，比如检查用户名、密码是否符合规范，等等。


    public boolean isIDValid(String id) {
        //todo 实现id检查逻辑，只能包括大小写字母和数字，长度在6-15位。
        return false;
    }

    public boolean isPwValid(String pw) {

        //Password follows the same rules with ID.
        return isIDValid(pw);
    }

    
    /** 
    * @Description:  
    * @Param:  
    * @return:  
    * @Author: Thomas Andon
    * @Date: 2021/3/29
    */
    public boolean isSameString (String s1, String s2) {
        return s1.equals(s2);
    }

    


}
