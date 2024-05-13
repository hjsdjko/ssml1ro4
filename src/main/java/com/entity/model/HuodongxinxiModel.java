package com.entity.model;

import com.entity.HuodongxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 活动信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
public class HuodongxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huodongkaishishijian;
		
	/**
	 * 活动结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date huodongjieshushijian;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 活动场地
	 */
	
	private String huodongchangdi;
		
	/**
	 * 照片
	 */
	
	private String zhaopian;
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
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
	 
	public void setHuodongkaishishijian(Date huodongkaishishijian) {
		this.huodongkaishishijian = huodongkaishishijian;
	}
	
	/**
	 * 获取：活动开始时间
	 */
	public Date getHuodongkaishishijian() {
		return huodongkaishishijian;
	}
				
	
	/**
	 * 设置：活动结束时间
	 */
	 
	public void setHuodongjieshushijian(Date huodongjieshushijian) {
		this.huodongjieshushijian = huodongjieshushijian;
	}
	
	/**
	 * 获取：活动结束时间
	 */
	public Date getHuodongjieshushijian() {
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
	 * 设置：照片
	 */
	 
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
			
}
