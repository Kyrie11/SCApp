package com.pro.yusenze.shengchuang.Item;

import java.io.Serializable;
import java.util.Date;

public class MQ7 implements Serializable {
    private int data;
    private Date time;

    public MQ7(int data, Date time) {
        this.data = data;
        this.time = time;
    }

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
