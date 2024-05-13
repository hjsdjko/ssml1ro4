package com.dao;

import com.entity.XinwengaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XinwengaoVO;
import com.entity.view.XinwengaoView;


/**
 * 新闻稿
 * 
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
public interface XinwengaoDao extends BaseMapper<XinwengaoEntity> {
	
	List<XinwengaoVO> selectListVO(@Param("ew") Wrapper<XinwengaoEntity> wrapper);
	
	XinwengaoVO selectVO(@Param("ew") Wrapper<XinwengaoEntity> wrapper);
	
	List<XinwengaoView> selectListView(@Param("ew") Wrapper<XinwengaoEntity> wrapper);

	List<XinwengaoView> selectListView(Pagination page,@Param("ew") Wrapper<XinwengaoEntity> wrapper);
	
	XinwengaoView selectView(@Param("ew") Wrapper<XinwengaoEntity> wrapper);
	
}
