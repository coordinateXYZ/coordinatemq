package com.coordinate.entity;

import lombok.Data;

/**
 * created by zsunny
 * Email zsunny@yeah.net
 * Date on 2018/7/26.
 */
@Data
public class BrokerInfo {

    private String brokerName;
    private int brokerId;
    private int queueNum;
    private String addr;

}
