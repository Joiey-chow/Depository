package com.example.demo.Bean;

public class Result {
    //响应
    private int code;

    public Result(int code){
        this.code = code;
    }
    public int getCode(){
        return code;
    }
    public void setCode(int code){
        this.code = code;
    }
}
