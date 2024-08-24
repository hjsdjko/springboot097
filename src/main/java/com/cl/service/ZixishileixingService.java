package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZixishileixingEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZixishileixingView;


/**
 * 自习室类型
 *
 * @author 
 * @email 
 * @date 2024-03-24 12:58:55
 */
public interface ZixishileixingService extends IService<ZixishileixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZixishileixingView> selectListView(Wrapper<ZixishileixingEntity> wrapper);
   	
   	ZixishileixingView selectView(@Param("ew") Wrapper<ZixishileixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZixishileixingEntity> wrapper);
   	

}

