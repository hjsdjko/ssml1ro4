package com.entity.vo;

import com.entity.ZanzhuqiyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 赞助企业
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
public class ZanzhuqiyeVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
