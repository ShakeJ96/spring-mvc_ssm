package com.controller;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.security.PublicKey;

public class Code {
    public static final Integer SAVE_OK=20011;
    public static final Integer DELETE_OK=20021;
    public static final Integer UPDATE_OK=20031;
    public static final Integer GET_OK=20041;

    public static final Integer SAVE_ERROR=20010;
    public static final Integer DELETE_ERROR=20020;
    public static final Integer UPDATE_ERROR=20030;
    public static final Integer GET_ERROR=20040;

    public static final Integer SYSTEM_ERR=50001;

    public static final Integer SYSTEM_TIMEOUT_ERR=50002;

    public static final Integer SYSTEM_UNKNOW_ERR=59999;

    public static final Integer BUSINESS_ERR=60002;

}
