package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuodongcanyurenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuodongcanyurenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuodongcanyurenyuanView;


/**
 * 活动参与人员
 *
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
public interface HuodongcanyurenyuanService extends IService<HuodongcanyurenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuodongcanyurenyuanVO> selectListVO(Wrapper<HuodongcanyurenyuanEntity> wrapper);
   	
   	HuodongcanyurenyuanVO selectVO(@Param("ew") Wrapper<HuodongcanyurenyuanEntity> wrapper);
   	
   	List<HuodongcanyurenyuanView> selectListView(Wrapper<HuodongcanyurenyuanEntity> wrapper);
   	
   	HuodongcanyurenyuanView selectView(@Param("ew") Wrapper<HuodongcanyurenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuodongcanyurenyuanEntity> wrapper);
   	
}

