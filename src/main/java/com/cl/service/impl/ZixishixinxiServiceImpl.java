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


import com.cl.dao.ZixishixinxiDao;
import com.cl.entity.ZixishixinxiEntity;
import com.cl.service.ZixishixinxiService;
import com.cl.entity.view.ZixishixinxiView;

@Service("zixishixinxiService")
public class ZixishixinxiServiceImpl extends ServiceImpl<ZixishixinxiDao, ZixishixinxiEntity> implements ZixishixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZixishixinxiEntity> page = this.selectPage(
                new Query<ZixishixinxiEntity>(params).getPage(),
                new EntityWrapper<ZixishixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZixishixinxiEntity> wrapper) {
		  Page<ZixishixinxiView> page =new Query<ZixishixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<ZixishixinxiView> selectListView(Wrapper<ZixishixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZixishixinxiView selectView(Wrapper<ZixishixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
