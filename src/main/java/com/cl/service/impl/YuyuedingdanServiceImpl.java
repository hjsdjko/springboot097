package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.YuyuedingdanDao;
import com.cl.entity.YuyuedingdanEntity;
import com.cl.service.YuyuedingdanService;
import com.cl.entity.view.YuyuedingdanView;

@Service("yuyuedingdanService")
public class YuyuedingdanServiceImpl extends ServiceImpl<YuyuedingdanDao, YuyuedingdanEntity> implements YuyuedingdanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuyuedingdanEntity> page = this.selectPage(
                new Query<YuyuedingdanEntity>(params).getPage(),
                new EntityWrapper<YuyuedingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuyuedingdanEntity> wrapper) {
		  Page<YuyuedingdanView> page =new Query<YuyuedingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<YuyuedingdanView> selectListView(Wrapper<YuyuedingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuyuedingdanView selectView(Wrapper<YuyuedingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YuyuedingdanEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YuyuedingdanEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YuyuedingdanEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
