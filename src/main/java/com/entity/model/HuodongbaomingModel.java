package com.entity.model;

import com.entity.HuodongbaomingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 活动报名
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
public class HuodongbaomingModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 照片
	 */
	
	private String zhaopian;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 报名时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baomingshijian;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：报名时间
	 */
	 
	public void setBaomingshijian(Date baomingshijian) {
		this.baomingshijian = baomingshijian;
	}
	
	/**
	 * 获取：报名时间
	 */
	public Date getBaomingshijian() {
		return baomingshijian;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
