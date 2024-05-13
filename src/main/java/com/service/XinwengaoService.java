package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XinwengaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XinwengaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XinwengaoView;


/**
 * 新闻稿
 *
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
public interface XinwengaoService extends IService<XinwengaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XinwengaoVO> selectListVO(Wrapper<XinwengaoEntity> wrapper);
   	
   	XinwengaoVO selectVO(@Param("ew") Wrapper<XinwengaoEntity> wrapper);
   	
   	List<XinwengaoView> selectListView(Wrapper<XinwengaoEntity> wrapper);
   	
   	XinwengaoView selectView(@Param("ew") Wrapper<XinwengaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XinwengaoEntity> wrapper);
   	
}

