package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.PingjiaxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.PingjiaxinxiView;


/**
 * 评价信息
 *
 * @author 
 * @email 
 * @date 2024-03-24 12:58:55
 */
public interface PingjiaxinxiService extends IService<PingjiaxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PingjiaxinxiView> selectListView(Wrapper<PingjiaxinxiEntity> wrapper);
   	
   	PingjiaxinxiView selectView(@Param("ew") Wrapper<PingjiaxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PingjiaxinxiEntity> wrapper);
   	

}

