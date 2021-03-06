package com.sky.rpc.comm.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author bainao
 */
@Data
public class Response implements Serializable {

    private String requestId;

    private Object result;

    private int errorCode;

    private long requestTime;

    private String errorMsg;

}
