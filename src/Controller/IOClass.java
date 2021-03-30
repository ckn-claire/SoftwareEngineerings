package Controller;


import java.io.*;
import java.util.HashMap;
/**
* @Description:  Used to write user information
* @Param:
* @return:
* @Author: CloudKing
* @Date: 2012/3/30
*/
public class IOClass {

    public void Writer(String id,String pw1) throws IOException {
        File fout = new File("Userinfo.txt");

        FileOutputStream fos = new FileOutputStream(fout,true);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        bw.write("ID:" + id +";"+ "Password:" + pw1);
        bw.newLine();
        bw.close();//todo 简单的将个人注册信息输入到info 当中放
    }
}
