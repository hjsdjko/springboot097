package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscusszixishixinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscusszixishixinxiView;


/**
 * 自习室信息评论表
 *
 * @author 
 * @email 
 * @date 2024-03-24 12:58:55
 */
public interface DiscusszixishixinxiService extends IService<DiscusszixishixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusszixishixinxiView> selectListView(Wrapper<DiscusszixishixinxiEntity> wrapper);
   	
   	DiscusszixishixinxiView selectView(@Param("ew") Wrapper<DiscusszixishixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusszixishixinxiEntity> wrapper);
   	

}

