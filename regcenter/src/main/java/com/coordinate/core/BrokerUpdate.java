package com.coordinate.core;

import com.coordinate.entity.BrokerInfo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BrokerUpdate {

    private Map<String,Map<Integer,BrokerInfo>> brokerCache = new ConcurrentHashMap<String, Map<Integer,BrokerInfo>>();




}
