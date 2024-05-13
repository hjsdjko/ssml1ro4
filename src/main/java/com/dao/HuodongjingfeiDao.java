package com.dao;

import com.entity.HuodongjingfeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuodongjingfeiVO;
import com.entity.view.HuodongjingfeiView;


/**
 * 活动经费
 * 
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
public interface HuodongjingfeiDao extends BaseMapper<HuodongjingfeiEntity> {
	
	List<HuodongjingfeiVO> selectListVO(@Param("ew") Wrapper<HuodongjingfeiEntity> wrapper);
	
	HuodongjingfeiVO selectVO(@Param("ew") Wrapper<HuodongjingfeiEntity> wrapper);
	
	List<HuodongjingfeiView> selectListView(@Param("ew") Wrapper<HuodongjingfeiEntity> wrapper);

	List<HuodongjingfeiView> selectListView(Pagination page,@Param("ew") Wrapper<HuodongjingfeiEntity> wrapper);
	
	HuodongjingfeiView selectView(@Param("ew") Wrapper<HuodongjingfeiEntity> wrapper);
	
}
