package com.lb.seckill.entity;

import lombok.Data;

import java.util.Date;

/**
 * 成功秒杀实体
 *
 * @author lb
 * @create 2017-03-07
 */
@Data
public class SuccessKilled {

    private String seckillId;

    private long userPhone;

    private short state;

    private Date creteTime;


    // 多对一的复合属性
    private Seckill seckill;


}
