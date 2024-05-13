package com.entity.view;

import com.entity.HuodongcanyurenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 活动参与人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
@TableName("huodongcanyurenyuan")
public class HuodongcanyurenyuanView  extends HuodongcanyurenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HuodongcanyurenyuanView(){
	}
 
 	public HuodongcanyurenyuanView(HuodongcanyurenyuanEntity huodongcanyurenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, huodongcanyurenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
