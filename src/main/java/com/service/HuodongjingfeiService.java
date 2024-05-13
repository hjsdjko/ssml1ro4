package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongjingfeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodongjingfeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongjingfeiView;


/**
 * 活动经费
 *
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
public interface HuodongjingfeiService extends IService<HuodongjingfeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongjingfeiVO> selectListVO(Wrapper<HuodongjingfeiEntity> wrapper);
   	
   	HuodongjingfeiVO selectVO(@Param("ew") Wrapper<HuodongjingfeiEntity> wrapper);
   	
   	List<HuodongjingfeiView> selectListView(Wrapper<HuodongjingfeiEntity> wrapper);
   	
   	HuodongjingfeiView selectView(@Param("ew") Wrapper<HuodongjingfeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongjingfeiEntity> wrapper);
   	
}

