package com.coordinate.entity;

/**
 * created by zsunny
 * Email zsunny@yeah.net
 * Date on 2018/7/26.
 */
public class ResponseType {

    public static final Response<Object> SIMPLE_SUCCESS = new Response<Object>(CodeType.SUCCESS,"success",null);
    public static final Response<Object> UNKNOWN_FAIL = new Response<Object>(CodeType.UNKNOWN_ERROR,"unknown",null);

}
