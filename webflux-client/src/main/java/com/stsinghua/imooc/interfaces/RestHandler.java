package com.stsinghua.imooc.interfaces;

import com.stsinghua.beans.MethodInfo;
import com.stsinghua.beans.ServerInfo;

/**
 * rest请求调用handler
 * 
 * @author stsinghua
 *
 */
public interface RestHandler {

	/**
	 * 初始化服务器信息
	 * 
	 * @param serverInfo
	 */
	void init(ServerInfo serverInfo);

	/**
	 * 调用rest请求, 返回接口
	 * 
	 * @param methodInfo
	 * @return
	 */
	Object invokeRest(MethodInfo methodInfo);

}
