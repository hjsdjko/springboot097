package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.ZixishixinxiEntity;
import com.cl.entity.view.ZixishixinxiView;

import com.cl.service.ZixishixinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;
import com.cl.service.StoreupService;
import com.cl.entity.StoreupEntity;

/**
 * 自习室信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-24 12:58:55
 */
@RestController
@RequestMapping("/zixishixinxi")
public class ZixishixinxiController {
    @Autowired
    private ZixishixinxiService zixishixinxiService;

    @Autowired
    private StoreupService storeupService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZixishixinxiEntity zixishixinxi,
		HttpServletRequest request){
        EntityWrapper<ZixishixinxiEntity> ew = new EntityWrapper<ZixishixinxiEntity>();

		PageUtils page = zixishixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zixishixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZixishixinxiEntity zixishixinxi, 
		HttpServletRequest request){
        EntityWrapper<ZixishixinxiEntity> ew = new EntityWrapper<ZixishixinxiEntity>();

		PageUtils page = zixishixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zixishixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZixishixinxiEntity zixishixinxi){
       	EntityWrapper<ZixishixinxiEntity> ew = new EntityWrapper<ZixishixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zixishixinxi, "zixishixinxi")); 
        return R.ok().put("data", zixishixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZixishixinxiEntity zixishixinxi){
        EntityWrapper< ZixishixinxiEntity> ew = new EntityWrapper< ZixishixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zixishixinxi, "zixishixinxi")); 
		ZixishixinxiView zixishixinxiView =  zixishixinxiService.selectView(ew);
		return R.ok("查询自习室信息成功").put("data", zixishixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZixishixinxiEntity zixishixinxi = zixishixinxiService.selectById(id);
		zixishixinxi = zixishixinxiService.selectView(new EntityWrapper<ZixishixinxiEntity>().eq("id", id));
        return R.ok().put("data", zixishixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZixishixinxiEntity zixishixinxi = zixishixinxiService.selectById(id);
		zixishixinxi = zixishixinxiService.selectView(new EntityWrapper<ZixishixinxiEntity>().eq("id", id));
        return R.ok().put("data", zixishixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZixishixinxiEntity zixishixinxi, HttpServletRequest request){
    	zixishixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zixishixinxi);
        zixishixinxiService.insert(zixishixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZixishixinxiEntity zixishixinxi, HttpServletRequest request){
    	zixishixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zixishixinxi);
        zixishixinxiService.insert(zixishixinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZixishixinxiEntity zixishixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zixishixinxi);
        zixishixinxiService.updateById(zixishixinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zixishixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
