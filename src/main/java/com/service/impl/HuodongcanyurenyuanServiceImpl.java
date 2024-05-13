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


import com.dao.HuodongcanyurenyuanDao;
import com.entity.HuodongcanyurenyuanEntity;
import com.service.HuodongcanyurenyuanService;
import com.entity.vo.HuodongcanyurenyuanVO;
import com.entity.view.HuodongcanyurenyuanView;

@Service("huodongcanyurenyuanService")
public class HuodongcanyurenyuanServiceImpl extends ServiceImpl<HuodongcanyurenyuanDao, HuodongcanyurenyuanEntity> implements HuodongcanyurenyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongcanyurenyuanEntity> page = this.selectPage(
                new Query<HuodongcanyurenyuanEntity>(params).getPage(),
                new EntityWrapper<HuodongcanyurenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongcanyurenyuanEntity> wrapper) {
		  Page<HuodongcanyurenyuanView> page =new Query<HuodongcanyurenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuodongcanyurenyuanVO> selectListVO(Wrapper<HuodongcanyurenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuodongcanyurenyuanVO selectVO(Wrapper<HuodongcanyurenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuodongcanyurenyuanView> selectListView(Wrapper<HuodongcanyurenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongcanyurenyuanView selectView(Wrapper<HuodongcanyurenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
