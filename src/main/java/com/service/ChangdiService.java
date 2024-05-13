package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChangdiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChangdiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangdiView;


/**
 * 场地
 *
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
public interface ChangdiService extends IService<ChangdiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChangdiVO> selectListVO(Wrapper<ChangdiEntity> wrapper);
   	
   	ChangdiVO selectVO(@Param("ew") Wrapper<ChangdiEntity> wrapper);
   	
   	List<ChangdiView> selectListView(Wrapper<ChangdiEntity> wrapper);
   	
   	ChangdiView selectView(@Param("ew") Wrapper<ChangdiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChangdiEntity> wrapper);
   	
}

