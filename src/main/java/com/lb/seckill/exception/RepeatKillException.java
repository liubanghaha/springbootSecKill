package com.lb.seckill.exception;

/**
 * 重复秒杀异常（运行期异常）
 * 
 * @author lb
 * @create 2017-03-07
 */
public class RepeatKillException extends SeckillException {
	public RepeatKillException(String message) {
		super(message);
	}

	public RepeatKillException(String message, Throwable cause) {
		super(message, cause);
	}

}
