package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 自习室信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-24 12:58:55
 */
@TableName("zixishixinxi")
public class ZixishixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZixishixinxiEntity() {
		
	}
	
	public ZixishixinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 自习室名称
	 */
					
	private String zixishimingcheng;
	
	/**
	 * 自习室类型
	 */
					
	private String zixishileixing;
	
	/**
	 * 自习室位置
	 */
					
	private String zixishiweizhi;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 开放时间
	 */
					
	private String kaifangshijian;
	
	/**
	 * 座位数
	 */
					
	private String zuoweishu;
	
	/**
	 * 每小时价
	 */
					
	private Double meixiaoshijia;
	
	/**
	 * 座位号
	 */
					
	private String zuoweihao;
	
	/**
	 * 设备施设
	 */
					
	private String shebeishishe;
	
	/**
	 * 详情
	 */
					
	private String xiangqing;
	
	/**
	 * 预约状态
	 */
					
	private String yuyuezhuangtai;
	
	/**
	 * 收藏数量
	 */
					
	private Integer storeupnum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：自习室名称
	 */
	public void setZixishimingcheng(String zixishimingcheng) {
		this.zixishimingcheng = zixishimingcheng;
	}
	/**
	 * 获取：自习室名称
	 */
	public String getZixishimingcheng() {
		return zixishimingcheng;
	}
	/**
	 * 设置：自习室类型
	 */
	public void setZixishileixing(String zixishileixing) {
		this.zixishileixing = zixishileixing;
	}
	/**
	 * 获取：自习室类型
	 */
	public String getZixishileixing() {
		return zixishileixing;
	}
	/**
	 * 设置：自习室位置
	 */
	public void setZixishiweizhi(String zixishiweizhi) {
		this.zixishiweizhi = zixishiweizhi;
	}
	/**
	 * 获取：自习室位置
	 */
	public String getZixishiweizhi() {
		return zixishiweizhi;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：开放时间
	 */
	public void setKaifangshijian(String kaifangshijian) {
		this.kaifangshijian = kaifangshijian;
	}
	/**
	 * 获取：开放时间
	 */
	public String getKaifangshijian() {
		return kaifangshijian;
	}
	/**
	 * 设置：座位数
	 */
	public void setZuoweishu(String zuoweishu) {
		this.zuoweishu = zuoweishu;
	}
	/**
	 * 获取：座位数
	 */
	public String getZuoweishu() {
		return zuoweishu;
	}
	/**
	 * 设置：每小时价
	 */
	public void setMeixiaoshijia(Double meixiaoshijia) {
		this.meixiaoshijia = meixiaoshijia;
	}
	/**
	 * 获取：每小时价
	 */
	public Double getMeixiaoshijia() {
		return meixiaoshijia;
	}
	/**
	 * 设置：座位号
	 */
	public void setZuoweihao(String zuoweihao) {
		this.zuoweihao = zuoweihao;
	}
	/**
	 * 获取：座位号
	 */
	public String getZuoweihao() {
		return zuoweihao;
	}
	/**
	 * 设置：设备施设
	 */
	public void setShebeishishe(String shebeishishe) {
		this.shebeishishe = shebeishishe;
	}
	/**
	 * 获取：设备施设
	 */
	public String getShebeishishe() {
		return shebeishishe;
	}
	/**
	 * 设置：详情
	 */
	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}
	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}
	/**
	 * 设置：预约状态
	 */
	public void setYuyuezhuangtai(String yuyuezhuangtai) {
		this.yuyuezhuangtai = yuyuezhuangtai;
	}
	/**
	 * 获取：预约状态
	 */
	public String getYuyuezhuangtai() {
		return yuyuezhuangtai;
	}
	/**
	 * 设置：收藏数量
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数量
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
