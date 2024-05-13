package com.entity.vo;

import com.entity.HuodongjingfeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 活动经费
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
public class HuodongjingfeiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 发布时间
	 */
	
	private String fabushijian;
		
	/**
	 * 赞助企业
	 */
	
	private String zanzhuqiye;
		
	/**
	 * 活动内容
	 */
	
	private String huodongneirong;
		
	/**
	 * 活动开始时间
	 */
	
	private String huodongkaishishijian;
		
	/**
	 * 活动结束时间
	 */
	
	private String huodongjieshushijian;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 活动场地
	 */
	
	private String huodongchangdi;
		
	/**
	 * 活动经费
	 */
	
	private String huodongjingfei;
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(String fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public String getFabushijian() {
		return fabushijian;
	}
				
	
	/**
	 * 设置：赞助企业
	 */
	 
	public void setZanzhuqiye(String zanzhuqiye) {
		this.zanzhuqiye = zanzhuqiye;
	}
	
	/**
	 * 获取：赞助企业
	 */
	public String getZanzhuqiye() {
		return zanzhuqiye;
	}
				
	
	/**
	 * 设置：活动内容
	 */
	 
	public void setHuodongneirong(String huodongneirong) {
		this.huodongneirong = huodongneirong;
	}
	
	/**
	 * 获取：活动内容
	 */
	public String getHuodongneirong() {
		return huodongneirong;
	}
				
	
	/**
	 * 设置：活动开始时间
	 */
	 
	public void setHuodongkaishishijian(String huodongkaishishijian) {
		this.huodongkaishishijian = huodongkaishishijian;
	}
	
	/**
	 * 获取：活动开始时间
	 */
	public String getHuodongkaishishijian() {
		return huodongkaishishijian;
	}
				
	
	/**
	 * 设置：活动结束时间
	 */
	 
	public void setHuodongjieshushijian(String huodongjieshushijian) {
		this.huodongjieshushijian = huodongjieshushijian;
	}
	
	/**
	 * 获取：活动结束时间
	 */
	public String getHuodongjieshushijian() {
		return huodongjieshushijian;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：活动场地
	 */
	 
	public void setHuodongchangdi(String huodongchangdi) {
		this.huodongchangdi = huodongchangdi;
	}
	
	/**
	 * 获取：活动场地
	 */
	public String getHuodongchangdi() {
		return huodongchangdi;
	}
				
	
	/**
	 * 设置：活动经费
	 */
	 
	public void setHuodongjingfei(String huodongjingfei) {
		this.huodongjingfei = huodongjingfei;
	}
	
	/**
	 * 获取：活动经费
	 */
	public String getHuodongjingfei() {
		return huodongjingfei;
	}
			
}
