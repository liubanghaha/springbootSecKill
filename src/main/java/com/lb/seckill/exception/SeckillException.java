package com.lb.seckill.exception;

/**
 * 秒杀相关业务异常
 *
 * @author lb
 * @create 2017-03-07
 */
public class SeckillException extends RuntimeException {

	public SeckillException(String message) {
		super(message);
	}

	public SeckillException(String message, Throwable cause) {
		super(message, cause);
	}

}
