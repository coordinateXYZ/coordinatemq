package com.coordinate.entity;

import org.omg.CORBA.UNKNOWN;

public class ResponseType {

    public static final Response<Object> SIMPLE_SUCCESS = new Response<Object>(CodeType.SUCCESS,"success",null);
    public static final Response<Object> UNKNOWN_FAIL = new Response<Object>(CodeType.UNKNOWN_ERROR,"unknown",null);

}
