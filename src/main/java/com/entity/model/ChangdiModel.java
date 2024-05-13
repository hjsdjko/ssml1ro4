package com.entity.model;

import com.entity.ChangdiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 场地
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
public class ChangdiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
