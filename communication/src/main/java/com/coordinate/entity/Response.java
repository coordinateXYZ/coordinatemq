package com.coordinate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * created by zsunny
 * Email zsunny@yeah.net
 * Date on 2018/7/26.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Response<T> {

    private int code;
    private String msg;
    private T data;

}
