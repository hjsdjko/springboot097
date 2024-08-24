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


import com.cl.dao.DiscusszixishixinxiDao;
import com.cl.entity.DiscusszixishixinxiEntity;
import com.cl.service.DiscusszixishixinxiService;
import com.cl.entity.view.DiscusszixishixinxiView;

@Service("discusszixishixinxiService")
public class DiscusszixishixinxiServiceImpl extends ServiceImpl<DiscusszixishixinxiDao, DiscusszixishixinxiEntity> implements DiscusszixishixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusszixishixinxiEntity> page = this.selectPage(
                new Query<DiscusszixishixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscusszixishixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusszixishixinxiEntity> wrapper) {
		  Page<DiscusszixishixinxiView> page =new Query<DiscusszixishixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscusszixishixinxiView> selectListView(Wrapper<DiscusszixishixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusszixishixinxiView selectView(Wrapper<DiscusszixishixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
