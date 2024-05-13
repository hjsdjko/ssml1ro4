package com.dao;

import com.entity.ZanzhuqiyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZanzhuqiyeVO;
import com.entity.view.ZanzhuqiyeView;


/**
 * 赞助企业
 * 
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
public interface ZanzhuqiyeDao extends BaseMapper<ZanzhuqiyeEntity> {
	
	List<ZanzhuqiyeVO> selectListVO(@Param("ew") Wrapper<ZanzhuqiyeEntity> wrapper);
	
	ZanzhuqiyeVO selectVO(@Param("ew") Wrapper<ZanzhuqiyeEntity> wrapper);
	
	List<ZanzhuqiyeView> selectListView(@Param("ew") Wrapper<ZanzhuqiyeEntity> wrapper);

	List<ZanzhuqiyeView> selectListView(Pagination page,@Param("ew") Wrapper<ZanzhuqiyeEntity> wrapper);
	
	ZanzhuqiyeView selectView(@Param("ew") Wrapper<ZanzhuqiyeEntity> wrapper);
	
}
