package com.cl.dao;

import com.cl.entity.ZixishixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZixishixinxiView;


/**
 * 自习室信息
 * 
 * @author 
 * @email 
 * @date 2024-03-24 12:58:55
 */
public interface ZixishixinxiDao extends BaseMapper<ZixishixinxiEntity> {
	
	List<ZixishixinxiView> selectListView(@Param("ew") Wrapper<ZixishixinxiEntity> wrapper);

	List<ZixishixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZixishixinxiEntity> wrapper);
	
	ZixishixinxiView selectView(@Param("ew") Wrapper<ZixishixinxiEntity> wrapper);
	

}
