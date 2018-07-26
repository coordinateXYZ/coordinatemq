package com.coordinate.utils;/*
Administrator
2018/7/26
Describtion:
Version:1.0v
*/

import com.coordinate.entity.Broker;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author dabai_cai
 * @create 2018-07-26 20:16
 */

public class FileUtils {
    public static Broker loadBroker() throws FileNotFoundException {
        Broker broker=null;
        Yaml yaml=new Yaml();
        File yml=new File("/resources/application.yml");
        broker=yaml.loadAs(new FileInputStream(yml),Broker.class);
        if(broker==null){
            broker= new Broker();
        }
        return broker;
    }
}
