package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChangdiDao;
import com.entity.ChangdiEntity;
import com.service.ChangdiService;
import com.entity.vo.ChangdiVO;
import com.entity.view.ChangdiView;

@Service("changdiService")
public class ChangdiServiceImpl extends ServiceImpl<ChangdiDao, ChangdiEntity> implements ChangdiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChangdiEntity> page = this.selectPage(
                new Query<ChangdiEntity>(params).getPage(),
                new EntityWrapper<ChangdiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChangdiEntity> wrapper) {
		  Page<ChangdiView> page =new Query<ChangdiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChangdiVO> selectListVO(Wrapper<ChangdiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChangdiVO selectVO(Wrapper<ChangdiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChangdiView> selectListView(Wrapper<ChangdiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChangdiView selectView(Wrapper<ChangdiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
