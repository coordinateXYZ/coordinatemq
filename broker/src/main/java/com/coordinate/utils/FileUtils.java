package com.coordinate.utils;

import com.coordinate.entity.Broker;
import org.yaml.snakeyaml.Yaml;

import java.io.FileNotFoundException;

/**
 * @author dabai_cai
 * @create 2018-07-26 20:16
 */

public class FileUtils {
    public static Broker loadBroker() {
        Broker broker=null;
        Yaml yaml=new Yaml();
        broker=yaml.loadAs(FileUtils.class.getResourceAsStream("application.yml"),Broker.class);
        if(broker==null){
            broker= new Broker();
        }
        return broker;
    }
}
