package com.entity.view;

import com.entity.ZanzhuqiyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 赞助企业
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
@TableName("zanzhuqiye")
public class ZanzhuqiyeView  extends ZanzhuqiyeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZanzhuqiyeView(){
	}
 
 	public ZanzhuqiyeView(ZanzhuqiyeEntity zanzhuqiyeEntity){
 	try {
			BeanUtils.copyProperties(this, zanzhuqiyeEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
