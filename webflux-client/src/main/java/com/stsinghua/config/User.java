package com.stsinghua.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 类名可以随意, 字段需要保持一致
 * 
 * @author stsinghua
 *
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private String id;

	private String name;

	private int age;

}
