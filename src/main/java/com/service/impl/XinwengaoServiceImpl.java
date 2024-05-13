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


import com.dao.XinwengaoDao;
import com.entity.XinwengaoEntity;
import com.service.XinwengaoService;
import com.entity.vo.XinwengaoVO;
import com.entity.view.XinwengaoView;

@Service("xinwengaoService")
public class XinwengaoServiceImpl extends ServiceImpl<XinwengaoDao, XinwengaoEntity> implements XinwengaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XinwengaoEntity> page = this.selectPage(
                new Query<XinwengaoEntity>(params).getPage(),
                new EntityWrapper<XinwengaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XinwengaoEntity> wrapper) {
		  Page<XinwengaoView> page =new Query<XinwengaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XinwengaoVO> selectListVO(Wrapper<XinwengaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XinwengaoVO selectVO(Wrapper<XinwengaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XinwengaoView> selectListView(Wrapper<XinwengaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XinwengaoView selectView(Wrapper<XinwengaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
