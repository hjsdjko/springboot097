package com.cl.entity.view;

import com.cl.entity.ZixishixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 自习室信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-24 12:58:55
 */
@TableName("zixishixinxi")
public class ZixishixinxiView  extends ZixishixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZixishixinxiView(){
	}
 
 	public ZixishixinxiView(ZixishixinxiEntity zixishixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zixishixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
