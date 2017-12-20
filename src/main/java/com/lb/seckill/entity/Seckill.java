package com.lb.seckill.entity;

import lombok.Data;

import java.util.Date;

/**
 * 秒杀库存实体
 *
 * @author lb
 * @create 2017-03-07
 */
@Data
public class Seckill {

    private String seckillId;

    private String name;

    private int number;

    private Date startTime;

    private Date endTime;

    private Date createTime;

}
