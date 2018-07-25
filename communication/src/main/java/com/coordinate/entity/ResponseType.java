package com.coordinate.entity;

public class ResponseType {

    public static final Response<Object> SIMPLE_SUCCESS = new Response<Object>(0,"success",null);
    public static final Response<Object> UNKNOWN_FAIL = new Response<Object>(-1,"unknown",null);

}
