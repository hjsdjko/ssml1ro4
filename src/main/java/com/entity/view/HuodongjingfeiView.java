package com.entity.view;

import com.entity.HuodongjingfeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 活动经费
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
@TableName("huodongjingfei")
public class HuodongjingfeiView  extends HuodongjingfeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuodongjingfeiView(){
	}
 
 	public HuodongjingfeiView(HuodongjingfeiEntity huodongjingfeiEntity){
 	try {
			BeanUtils.copyProperties(this, huodongjingfeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
