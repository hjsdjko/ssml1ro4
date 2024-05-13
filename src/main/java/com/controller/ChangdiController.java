package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ChangdiEntity;
import com.entity.view.ChangdiView;

import com.service.ChangdiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 场地
 * 后端接口
 * @author 
 * @email 
 * @date 2021-05-21 15:38:23
 */
@RestController
@RequestMapping("/changdi")
public class ChangdiController {
    @Autowired
    private ChangdiService changdiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChangdiEntity changdi, 
		HttpServletRequest request){

        EntityWrapper<ChangdiEntity> ew = new EntityWrapper<ChangdiEntity>();
		PageUtils page = changdiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, changdi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChangdiEntity changdi, 
		HttpServletRequest request){
        EntityWrapper<ChangdiEntity> ew = new EntityWrapper<ChangdiEntity>();
		PageUtils page = changdiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, changdi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChangdiEntity changdi){
       	EntityWrapper<ChangdiEntity> ew = new EntityWrapper<ChangdiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( changdi, "changdi")); 
        return R.ok().put("data", changdiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChangdiEntity changdi){
        EntityWrapper< ChangdiEntity> ew = new EntityWrapper< ChangdiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( changdi, "changdi")); 
		ChangdiView changdiView =  changdiService.selectView(ew);
		return R.ok("查询场地成功").put("data", changdiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChangdiEntity changdi = changdiService.selectById(id);
        return R.ok().put("data", changdi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChangdiEntity changdi = changdiService.selectById(id);
        return R.ok().put("data", changdi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChangdiEntity changdi, HttpServletRequest request){
    	changdi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(changdi);

        changdiService.insert(changdi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChangdiEntity changdi, HttpServletRequest request){
    	changdi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(changdi);

        changdiService.insert(changdi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ChangdiEntity changdi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(changdi);
        changdiService.updateById(changdi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        changdiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ChangdiEntity> wrapper = new EntityWrapper<ChangdiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = changdiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
