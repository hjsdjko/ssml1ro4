package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 活动经费
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
@TableName("huodongjingfei")
public class HuodongjingfeiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HuodongjingfeiEntity() {
		
	}
	
	public HuodongjingfeiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 活动标题
	 */
					
	private String huodongbiaoti;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：活动标题
	 */
	public void setHuodongbiaoti(String huodongbiaoti) {
		this.huodongbiaoti = huodongbiaoti;
	}
	/**
	 * 获取：活动标题
	 */
	public String getHuodongbiaoti() {
		return huodongbiaoti;
	}
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
