package com.lb.seckill.dto;


import com.lb.seckill.entity.SuccessKilled;
import com.lb.seckill.enums.SeckillStateEnum;
import lombok.Data;

/**
 * 封装秒杀执行后结果
 *
 * @author lb
 * @create 2017-03-07
 */
@Data
public class SeckillExecution {

    private String seckillId;

    // 秒杀执行结果状态
    private int state;

    // 状态标识
    private String stateInfo;

    // 秒杀成功对象
    private SuccessKilled successKilled;

    public SeckillExecution(String seckillId, SeckillStateEnum stateEnum, SuccessKilled successKilled) {
        this.seckillId = seckillId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
        this.successKilled = successKilled;
    }

    public SeckillExecution(String seckillId, SeckillStateEnum stateEnum) {
        this.seckillId = seckillId;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }


}
