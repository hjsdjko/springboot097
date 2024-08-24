package com.cl.dao;

import com.cl.entity.ZixishileixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZixishileixingView;


/**
 * 自习室类型
 * 
 * @author 
 * @email 
 * @date 2024-03-24 12:58:55
 */
public interface ZixishileixingDao extends BaseMapper<ZixishileixingEntity> {
	
	List<ZixishileixingView> selectListView(@Param("ew") Wrapper<ZixishileixingEntity> wrapper);

	List<ZixishileixingView> selectListView(Pagination page,@Param("ew") Wrapper<ZixishileixingEntity> wrapper);
	
	ZixishileixingView selectView(@Param("ew") Wrapper<ZixishileixingEntity> wrapper);
	

}
