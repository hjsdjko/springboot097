package com.cl.dao;

import com.cl.entity.PingjiaxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.PingjiaxinxiView;


/**
 * 评价信息
 * 
 * @author 
 * @email 
 * @date 2024-03-24 12:58:55
 */
public interface PingjiaxinxiDao extends BaseMapper<PingjiaxinxiEntity> {
	
	List<PingjiaxinxiView> selectListView(@Param("ew") Wrapper<PingjiaxinxiEntity> wrapper);

	List<PingjiaxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<PingjiaxinxiEntity> wrapper);
	
	PingjiaxinxiView selectView(@Param("ew") Wrapper<PingjiaxinxiEntity> wrapper);
	

}
