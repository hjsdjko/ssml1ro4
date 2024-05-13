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
 * 赞助企业
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
@TableName("zanzhuqiye")
public class ZanzhuqiyeEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZanzhuqiyeEntity() {
		
	}
	
	public ZanzhuqiyeEntity(T t) {
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
	 * 企业名称
	 */
					
	private String qiyemingcheng;
	
	/**
	 * 企业信息
	 */
					
	private String qiyexinxi;
	
	/**
	 * 企业地址
	 */
					
	private String qiyedizhi;
	
	/**
	 * 企业电话
	 */
					
	private String qiyedianhua;
	
	/**
	 * 企业邮箱
	 */
					
	private String qiyeyouxiang;
	
	/**
	 * 相关负责人
	 */
					
	private String xiangguanfuzeren;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	
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
	 * 设置：企业名称
	 */
	public void setQiyemingcheng(String qiyemingcheng) {
		this.qiyemingcheng = qiyemingcheng;
	}
	/**
	 * 获取：企业名称
	 */
	public String getQiyemingcheng() {
		return qiyemingcheng;
	}
	/**
	 * 设置：企业信息
	 */
	public void setQiyexinxi(String qiyexinxi) {
		this.qiyexinxi = qiyexinxi;
	}
	/**
	 * 获取：企业信息
	 */
	public String getQiyexinxi() {
		return qiyexinxi;
	}
	/**
	 * 设置：企业地址
	 */
	public void setQiyedizhi(String qiyedizhi) {
		this.qiyedizhi = qiyedizhi;
	}
	/**
	 * 获取：企业地址
	 */
	public String getQiyedizhi() {
		return qiyedizhi;
	}
	/**
	 * 设置：企业电话
	 */
	public void setQiyedianhua(String qiyedianhua) {
		this.qiyedianhua = qiyedianhua;
	}
	/**
	 * 获取：企业电话
	 */
	public String getQiyedianhua() {
		return qiyedianhua;
	}
	/**
	 * 设置：企业邮箱
	 */
	public void setQiyeyouxiang(String qiyeyouxiang) {
		this.qiyeyouxiang = qiyeyouxiang;
	}
	/**
	 * 获取：企业邮箱
	 */
	public String getQiyeyouxiang() {
		return qiyeyouxiang;
	}
	/**
	 * 设置：相关负责人
	 */
	public void setXiangguanfuzeren(String xiangguanfuzeren) {
		this.xiangguanfuzeren = xiangguanfuzeren;
	}
	/**
	 * 获取：相关负责人
	 */
	public String getXiangguanfuzeren() {
		return xiangguanfuzeren;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}

}
