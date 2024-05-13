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


import com.dao.HuodongjingfeiDao;
import com.entity.HuodongjingfeiEntity;
import com.service.HuodongjingfeiService;
import com.entity.vo.HuodongjingfeiVO;
import com.entity.view.HuodongjingfeiView;

@Service("huodongjingfeiService")
public class HuodongjingfeiServiceImpl extends ServiceImpl<HuodongjingfeiDao, HuodongjingfeiEntity> implements HuodongjingfeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuodongjingfeiEntity> page = this.selectPage(
                new Query<HuodongjingfeiEntity>(params).getPage(),
                new EntityWrapper<HuodongjingfeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuodongjingfeiEntity> wrapper) {
		  Page<HuodongjingfeiView> page =new Query<HuodongjingfeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuodongjingfeiVO> selectListVO(Wrapper<HuodongjingfeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuodongjingfeiVO selectVO(Wrapper<HuodongjingfeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuodongjingfeiView> selectListView(Wrapper<HuodongjingfeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuodongjingfeiView selectView(Wrapper<HuodongjingfeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
