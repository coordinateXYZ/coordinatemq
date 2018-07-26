package com.coordinate.entity;

import lombok.Data;

@Data
public class BrokerInfo {

    private String brokerName;
    private int brokerId;
    private int queueNum;
    private String addr;

}
