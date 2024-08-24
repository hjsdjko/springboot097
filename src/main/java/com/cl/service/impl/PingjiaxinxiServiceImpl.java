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


import com.cl.dao.PingjiaxinxiDao;
import com.cl.entity.PingjiaxinxiEntity;
import com.cl.service.PingjiaxinxiService;
import com.cl.entity.view.PingjiaxinxiView;

@Service("pingjiaxinxiService")
public class PingjiaxinxiServiceImpl extends ServiceImpl<PingjiaxinxiDao, PingjiaxinxiEntity> implements PingjiaxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PingjiaxinxiEntity> page = this.selectPage(
                new Query<PingjiaxinxiEntity>(params).getPage(),
                new EntityWrapper<PingjiaxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PingjiaxinxiEntity> wrapper) {
		  Page<PingjiaxinxiView> page =new Query<PingjiaxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<PingjiaxinxiView> selectListView(Wrapper<PingjiaxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PingjiaxinxiView selectView(Wrapper<PingjiaxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
