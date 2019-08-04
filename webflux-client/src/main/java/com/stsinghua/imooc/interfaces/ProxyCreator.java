package com.stsinghua.imooc.interfaces;

/**
 * 创建代理类接口
 * 
 * @author stsinghua
 *
 */
public interface ProxyCreator {
	/**
	 * 创建代理类
	 * 
	 * @param type
	 * @return
	 */
	Object createProxy(Class<?> type);
}
