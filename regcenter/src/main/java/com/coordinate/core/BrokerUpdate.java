package com.coordinate.core;

import com.coordinate.annotation.ConfPath;
import com.coordinate.entity.BrokerInfo;
import lombok.Data;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * created by zsunny
 * Email zsunny@yeah.net
 * Date on 2018/7/26.
 */
@Data
public class BrokerUpdate {

    private Map<String,Map<Integer,BrokerInfo>> brokerCache = new ConcurrentHashMap<String, Map<Integer,BrokerInfo>>();

    @ConfPath("server.port")
    public static String port;


}
