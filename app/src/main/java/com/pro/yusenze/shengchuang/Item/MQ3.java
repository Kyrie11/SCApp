package com.pro.yusenze.shengchuang.Item;

import java.io.Serializable;
import java.util.Date;

public class MQ3 implements Serializable {
    private int data;
    private Date time;

    public MQ3(int data, Date time) {
        this.data = data;
        this.time = time;
    }

    public MQ3(){}

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
