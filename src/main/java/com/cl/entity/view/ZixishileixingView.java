package com.cl.entity.view;

import com.cl.entity.ZixishileixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 自习室类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-24 12:58:55
 */
@TableName("zixishileixing")
public class ZixishileixingView  extends ZixishileixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZixishileixingView(){
	}
 
 	public ZixishileixingView(ZixishileixingEntity zixishileixingEntity){
 	try {
			BeanUtils.copyProperties(this, zixishileixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
