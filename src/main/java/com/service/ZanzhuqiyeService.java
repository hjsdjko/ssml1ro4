package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZanzhuqiyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZanzhuqiyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZanzhuqiyeView;


/**
 * 赞助企业
 *
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
public interface ZanzhuqiyeService extends IService<ZanzhuqiyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZanzhuqiyeVO> selectListVO(Wrapper<ZanzhuqiyeEntity> wrapper);
   	
   	ZanzhuqiyeVO selectVO(@Param("ew") Wrapper<ZanzhuqiyeEntity> wrapper);
   	
   	List<ZanzhuqiyeView> selectListView(Wrapper<ZanzhuqiyeEntity> wrapper);
   	
   	ZanzhuqiyeView selectView(@Param("ew") Wrapper<ZanzhuqiyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZanzhuqiyeEntity> wrapper);
   	
}

