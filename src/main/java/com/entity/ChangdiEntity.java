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
 * 场地
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
@TableName("changdi")
public class ChangdiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ChangdiEntity() {
		
	}
	
	public ChangdiEntity(T t) {
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
	 * 场地编号
	 */
					
	private String changdibianhao;
	
	/**
	 * 场地名称
	 */
					
	private String changdimingcheng;
	
	/**
	 * 场地位置
	 */
					
	private String changdiweizhi;
	
	/**
	 * 是否空闲
	 */
					
	private String shifoukongxian;
	
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
	 * 设置：场地编号
	 */
	public void setChangdibianhao(String changdibianhao) {
		this.changdibianhao = changdibianhao;
	}
	/**
	 * 获取：场地编号
	 */
	public String getChangdibianhao() {
		return changdibianhao;
	}
	/**
	 * 设置：场地名称
	 */
	public void setChangdimingcheng(String changdimingcheng) {
		this.changdimingcheng = changdimingcheng;
	}
	/**
	 * 获取：场地名称
	 */
	public String getChangdimingcheng() {
		return changdimingcheng;
	}
	/**
	 * 设置：场地位置
	 */
	public void setChangdiweizhi(String changdiweizhi) {
		this.changdiweizhi = changdiweizhi;
	}
	/**
	 * 获取：场地位置
	 */
	public String getChangdiweizhi() {
		return changdiweizhi;
	}
	/**
	 * 设置：是否空闲
	 */
	public void setShifoukongxian(String shifoukongxian) {
		this.shifoukongxian = shifoukongxian;
	}
	/**
	 * 获取：是否空闲
	 */
	public String getShifoukongxian() {
		return shifoukongxian;
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
