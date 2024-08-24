package com.cl.dao;

import com.cl.entity.DiscusszixishixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusszixishixinxiView;


/**
 * 自习室信息评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-24 12:58:55
 */
public interface DiscusszixishixinxiDao extends BaseMapper<DiscusszixishixinxiEntity> {
	
	List<DiscusszixishixinxiView> selectListView(@Param("ew") Wrapper<DiscusszixishixinxiEntity> wrapper);

	List<DiscusszixishixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusszixishixinxiEntity> wrapper);
	
	DiscusszixishixinxiView selectView(@Param("ew") Wrapper<DiscusszixishixinxiEntity> wrapper);
	

}
