package com.consul.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by chy on 2019/5/5.
 */
@ConfigurationProperties(prefix="config")
public class Config {
	private String title; //name要与consul上面的title写的一样

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "title : ["+title+"] ";
	}
}
