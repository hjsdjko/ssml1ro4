package com.dao;

import com.entity.HuodongxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodongxinxiVO;
import com.entity.view.HuodongxinxiView;


/**
 * 活动信息
 * 
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
public interface HuodongxinxiDao extends BaseMapper<HuodongxinxiEntity> {
	
	List<HuodongxinxiVO> selectListVO(@Param("ew") Wrapper<HuodongxinxiEntity> wrapper);
	
	HuodongxinxiVO selectVO(@Param("ew") Wrapper<HuodongxinxiEntity> wrapper);
	
	List<HuodongxinxiView> selectListView(@Param("ew") Wrapper<HuodongxinxiEntity> wrapper);

	List<HuodongxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongxinxiEntity> wrapper);
	
	HuodongxinxiView selectView(@Param("ew") Wrapper<HuodongxinxiEntity> wrapper);
	
}
