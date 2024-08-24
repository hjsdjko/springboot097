package com.cl.dao;

import com.cl.entity.YuyuedingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YuyuedingdanView;


/**
 * 预约订单
 * 
 * @author 
 * @email 
 * @date 2024-03-24 12:58:55
 */
public interface YuyuedingdanDao extends BaseMapper<YuyuedingdanEntity> {
	
	List<YuyuedingdanView> selectListView(@Param("ew") Wrapper<YuyuedingdanEntity> wrapper);

	List<YuyuedingdanView> selectListView(Pagination page,@Param("ew") Wrapper<YuyuedingdanEntity> wrapper);
	
	YuyuedingdanView selectView(@Param("ew") Wrapper<YuyuedingdanEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuyuedingdanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuyuedingdanEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YuyuedingdanEntity> wrapper);



}
