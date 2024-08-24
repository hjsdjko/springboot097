package com.cl.dao;

import com.cl.entity.QuxiaodingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QuxiaodingdanView;


/**
 * 取消订单
 * 
 * @author 
 * @email 
 * @date 2024-03-24 12:58:55
 */
public interface QuxiaodingdanDao extends BaseMapper<QuxiaodingdanEntity> {
	
	List<QuxiaodingdanView> selectListView(@Param("ew") Wrapper<QuxiaodingdanEntity> wrapper);

	List<QuxiaodingdanView> selectListView(Pagination page,@Param("ew") Wrapper<QuxiaodingdanEntity> wrapper);
	
	QuxiaodingdanView selectView(@Param("ew") Wrapper<QuxiaodingdanEntity> wrapper);
	

}
