package com.lb.seckill.exception;

/**
 * 秒杀关闭异常
 * 
 * @author lb
 * @create 2017-03-07
 */
public class SeckillCloseException extends SeckillException {

	public SeckillCloseException(String message) {
		super(message);
	}

	public SeckillCloseException(String message, Throwable cause) {
		super(message, cause);
	}

}
