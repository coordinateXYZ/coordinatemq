package com.coordinate.core;

import com.coordinate.entity.BrokerInfo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * created by zsunny
 * Email zsunny@yeah.net
 * Date on 2018/7/26.
 */
public class BrokerUpdate {

    private Map<String,Map<Integer,BrokerInfo>> brokerCache = new ConcurrentHashMap<String, Map<Integer,BrokerInfo>>();




}
