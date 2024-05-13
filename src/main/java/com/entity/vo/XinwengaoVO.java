package com.entity.vo;

import com.entity.XinwengaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 新闻稿
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
public class XinwengaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 提交部门
	 */
	
	private String tijiaobumen;
		
	/**
	 * 提交时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tijiaoshijian;
		
	/**
	 * 文稿内容
	 */
	
	private String wengaoneirong;
				
	
	/**
	 * 设置：提交部门
	 */
	 
	public void setTijiaobumen(String tijiaobumen) {
		this.tijiaobumen = tijiaobumen;
	}
	
	/**
	 * 获取：提交部门
	 */
	public String getTijiaobumen() {
		return tijiaobumen;
	}
				
	
	/**
	 * 设置：提交时间
	 */
	 
	public void setTijiaoshijian(Date tijiaoshijian) {
		this.tijiaoshijian = tijiaoshijian;
	}
	
	/**
	 * 获取：提交时间
	 */
	public Date getTijiaoshijian() {
		return tijiaoshijian;
	}
				
	
	/**
	 * 设置：文稿内容
	 */
	 
	public void setWengaoneirong(String wengaoneirong) {
		this.wengaoneirong = wengaoneirong;
	}
	
	/**
	 * 获取：文稿内容
	 */
	public String getWengaoneirong() {
		return wengaoneirong;
	}
			
}
