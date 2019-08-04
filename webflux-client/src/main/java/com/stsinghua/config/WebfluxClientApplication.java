package com.stsinghua.config;

import com.stsinghua.imooc.interfaces.ProxyCreator;
import com.stsinghua.imooc.proxys.JDKProxyCreator;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class WebfluxClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxClientApplication.class, args);
	}

	/**
	 * 创建jdk代理工具类
	 * 
	 * @return
	 */
	@Bean
	ProxyCreator jdkProxyCreator() {
		return new JDKProxyCreator();
	}

	@Bean
	FactoryBean<IUserApi> userApi(ProxyCreator proxyCreator) {
		return new FactoryBean<IUserApi>() {

			@Override
			public Class<?> getObjectType() {
				return IUserApi.class;
			}

			/**
			 * 返回代理对象
			 */
			@Override
			public IUserApi getObject() throws Exception {
				return (IUserApi) proxyCreator
						.createProxy(this.getObjectType());
			}
		};
	}

}
