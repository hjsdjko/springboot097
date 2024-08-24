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


import com.cl.dao.ZixishileixingDao;
import com.cl.entity.ZixishileixingEntity;
import com.cl.service.ZixishileixingService;
import com.cl.entity.view.ZixishileixingView;

@Service("zixishileixingService")
public class ZixishileixingServiceImpl extends ServiceImpl<ZixishileixingDao, ZixishileixingEntity> implements ZixishileixingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZixishileixingEntity> page = this.selectPage(
                new Query<ZixishileixingEntity>(params).getPage(),
                new EntityWrapper<ZixishileixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZixishileixingEntity> wrapper) {
		  Page<ZixishileixingView> page =new Query<ZixishileixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ZixishileixingView> selectListView(Wrapper<ZixishileixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZixishileixingView selectView(Wrapper<ZixishileixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
