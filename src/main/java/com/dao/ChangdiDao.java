package com.dao;

import com.entity.ChangdiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChangdiVO;
import com.entity.view.ChangdiView;


/**
 * 场地
 * 
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
public interface ChangdiDao extends BaseMapper<ChangdiEntity> {
	
	List<ChangdiVO> selectListVO(@Param("ew") Wrapper<ChangdiEntity> wrapper);
	
	ChangdiVO selectVO(@Param("ew") Wrapper<ChangdiEntity> wrapper);
	
	List<ChangdiView> selectListView(@Param("ew") Wrapper<ChangdiEntity> wrapper);

	List<ChangdiView> selectListView(Pagination page,@Param("ew") Wrapper<ChangdiEntity> wrapper);
	
	ChangdiView selectView(@Param("ew") Wrapper<ChangdiEntity> wrapper);
	
}
