package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ZixishixinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ZixishixinxiView;


/**
 * 自习室信息
 *
 * @author 
 * @email 
 * @date 2024-03-24 12:58:55
 */
public interface ZixishixinxiService extends IService<ZixishixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZixishixinxiView> selectListView(Wrapper<ZixishixinxiEntity> wrapper);
   	
   	ZixishixinxiView selectView(@Param("ew") Wrapper<ZixishixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZixishixinxiEntity> wrapper);
   	

}

