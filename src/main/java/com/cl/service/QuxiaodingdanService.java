package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.QuxiaodingdanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.QuxiaodingdanView;


/**
 * 取消订单
 *
 * @author 
 * @email 
 * @date 2024-03-24 12:58:55
 */
public interface QuxiaodingdanService extends IService<QuxiaodingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuxiaodingdanView> selectListView(Wrapper<QuxiaodingdanEntity> wrapper);
   	
   	QuxiaodingdanView selectView(@Param("ew") Wrapper<QuxiaodingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuxiaodingdanEntity> wrapper);
   	

}

