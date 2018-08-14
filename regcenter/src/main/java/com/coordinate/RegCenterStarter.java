package com.coordinate;

import com.coordinate.annotation.Processor;
import com.coordinate.core.BrokerUpdate;

public class RegCenterStarter {

    public static void main(String[] args) {

        Processor.putAllConf();

        System.out.println(BrokerUpdate.port);

    }

}
