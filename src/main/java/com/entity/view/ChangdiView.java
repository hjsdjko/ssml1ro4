package com.entity.view;

import com.entity.ChangdiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 场地
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
@TableName("changdi")
public class ChangdiView  extends ChangdiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChangdiView(){
	}
 
 	public ChangdiView(ChangdiEntity changdiEntity){
 	try {
			BeanUtils.copyProperties(this, changdiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
