package guoyachen.mvc.vo;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Author:Guo Yachen
 * @Date:2020/7/14 12:12
 * @Description:
 * @Feature:
 */
public class MD5test {
    private static String password="gass";


    public static void main(String[] args) throws NoSuchAlgorithmException {
        MessageDigest md5 = MessageDigest.getInstance("MD5");

        md5.update(password.getBytes());

        System.out.print(new BigInteger(1,md5.digest()).toString(16));

    }



}
