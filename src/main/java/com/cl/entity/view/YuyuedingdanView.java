package com.cl.entity.view;

import com.cl.entity.YuyuedingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 预约订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-24 12:58:55
 */
@TableName("yuyuedingdan")
public class YuyuedingdanView  extends YuyuedingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuyuedingdanView(){
	}
 
 	public YuyuedingdanView(YuyuedingdanEntity yuyuedingdanEntity){
 	try {
			BeanUtils.copyProperties(this, yuyuedingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
