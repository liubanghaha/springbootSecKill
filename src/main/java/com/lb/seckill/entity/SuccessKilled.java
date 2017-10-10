package com.lb.seckill.entity;

import java.util.Date;

/**
 * 成功秒杀实体
 *
 * @author lb
 * @create 2017-03-07
 */
public class SuccessKilled {

    private String seckillId;

    private long userPhone;

    private short state;

    private Date creteTime;


    // 多对一的复合属性
    private Seckill seckill;

    public String getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(String seckillId) {
        this.seckillId = seckillId;
    }

    public long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(long userPhone) {
        this.userPhone = userPhone;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Date getCreteTime() {
        return creteTime;
    }

    public void setCreteTime(Date creteTime) {
        this.creteTime = creteTime;
    }

    public Seckill getSeckill() {
        return seckill;
    }

    public void setSeckill(Seckill seckill) {
        this.seckill = seckill;
    }

    @Override
    public String toString() {
        return "SuccessKilled [seckillId=" + seckillId + ", userPhone=" + userPhone + ", state=" + state
                + ", creteTime=" + creteTime + "]";
    }

}
