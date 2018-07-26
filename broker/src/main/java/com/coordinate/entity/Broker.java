package com.coordinate.entity;/*
Administrator
2018/7/26
Describtion:
Version:1.0v
*/

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dabai_cai
 * @create 2018-07-26 20:33
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Broker {
    private String name;
    private int id;

//    public Broker(int id) {
//        this.id = id;
//    }
//
//    public Broker(String name) {
//
//        this.name = name;
//    }
//
//    public int getId(){
//        return this.id;
//    }
//
//    public void setId(int _id){
//        this.id=_id;
//    }
//
//    public void setName(String _name){
//        this.name=_name;
//    }
//
//    public String getName(){
//        return this.name;
//    }
}
