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


import com.dao.ZanzhuqiyeDao;
import com.entity.ZanzhuqiyeEntity;
import com.service.ZanzhuqiyeService;
import com.entity.vo.ZanzhuqiyeVO;
import com.entity.view.ZanzhuqiyeView;

@Service("zanzhuqiyeService")
public class ZanzhuqiyeServiceImpl extends ServiceImpl<ZanzhuqiyeDao, ZanzhuqiyeEntity> implements ZanzhuqiyeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZanzhuqiyeEntity> page = this.selectPage(
                new Query<ZanzhuqiyeEntity>(params).getPage(),
                new EntityWrapper<ZanzhuqiyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZanzhuqiyeEntity> wrapper) {
		  Page<ZanzhuqiyeView> page =new Query<ZanzhuqiyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZanzhuqiyeVO> selectListVO(Wrapper<ZanzhuqiyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZanzhuqiyeVO selectVO(Wrapper<ZanzhuqiyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZanzhuqiyeView> selectListView(Wrapper<ZanzhuqiyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZanzhuqiyeView selectView(Wrapper<ZanzhuqiyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
