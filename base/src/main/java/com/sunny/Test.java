package com.sunny;

import java.io.IOException;

/**
 * created by zsunny
 * Email zsunny@yeah.net
 * Date on 2018/7/30.
 */
public class Test {


    public static void main(String[] args) {

        try {
            LocalPropertiesUtils.loadProperties("application.yml");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
