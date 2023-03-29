package com.example.demos.controller.utils;

import com.example.demos.dao.BookDao;
import lombok.Data;

@Data
public class R {
    private Boolean flag; //成功与否
    private Object data;  //数据
    private String msg;   //信息

    public R(){}

    public R(Boolean flag){
        this.flag = flag;
    }

    public R(Boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }

    public R(Boolean flag,String msg){
        this.flag = flag;
        this.msg = msg;
    }

    public R(String msg){
        this.flag = false;
        this.msg = msg;
    }
}
