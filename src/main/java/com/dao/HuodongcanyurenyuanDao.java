package com.dao;

import com.entity.HuodongcanyurenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodongcanyurenyuanVO;
import com.entity.view.HuodongcanyurenyuanView;


/**
 * 活动参与人员
 * 
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
public interface HuodongcanyurenyuanDao extends BaseMapper<HuodongcanyurenyuanEntity> {
	
	List<HuodongcanyurenyuanVO> selectListVO(@Param("ew") Wrapper<HuodongcanyurenyuanEntity> wrapper);
	
	HuodongcanyurenyuanVO selectVO(@Param("ew") Wrapper<HuodongcanyurenyuanEntity> wrapper);
	
	List<HuodongcanyurenyuanView> selectListView(@Param("ew") Wrapper<HuodongcanyurenyuanEntity> wrapper);

	List<HuodongcanyurenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongcanyurenyuanEntity> wrapper);
	
	HuodongcanyurenyuanView selectView(@Param("ew") Wrapper<HuodongcanyurenyuanEntity> wrapper);
	
}
