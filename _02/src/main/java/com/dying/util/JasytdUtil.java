package com.dying.util;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/5 20:49
 */
public class JasytdUtil {
    public static void main(String[] args) {
        //加密器
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        encryptor.setPassword("123456!@#");
        String username = encryptor.encrypt("root");
        String password = encryptor.encrypt("root123");
        System.out.println(username);
        System.out.println(password);

        //I6Wkuu+eP75DJyw4gKBnIA==
        //gq8DuFugPIB14kD/cG2jSg==
    }
}
