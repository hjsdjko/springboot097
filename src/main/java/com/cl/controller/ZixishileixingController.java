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

import com.cl.entity.ZixishileixingEntity;
import com.cl.entity.view.ZixishileixingView;

import com.cl.service.ZixishileixingService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 自习室类型
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-24 12:58:55
 */
@RestController
@RequestMapping("/zixishileixing")
public class ZixishileixingController {
    @Autowired
    private ZixishileixingService zixishileixingService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZixishileixingEntity zixishileixing,
		HttpServletRequest request){
        EntityWrapper<ZixishileixingEntity> ew = new EntityWrapper<ZixishileixingEntity>();

		PageUtils page = zixishileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zixishileixing), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZixishileixingEntity zixishileixing, 
		HttpServletRequest request){
        EntityWrapper<ZixishileixingEntity> ew = new EntityWrapper<ZixishileixingEntity>();

		PageUtils page = zixishileixingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zixishileixing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZixishileixingEntity zixishileixing){
       	EntityWrapper<ZixishileixingEntity> ew = new EntityWrapper<ZixishileixingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zixishileixing, "zixishileixing")); 
        return R.ok().put("data", zixishileixingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZixishileixingEntity zixishileixing){
        EntityWrapper< ZixishileixingEntity> ew = new EntityWrapper< ZixishileixingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zixishileixing, "zixishileixing")); 
		ZixishileixingView zixishileixingView =  zixishileixingService.selectView(ew);
		return R.ok("查询自习室类型成功").put("data", zixishileixingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZixishileixingEntity zixishileixing = zixishileixingService.selectById(id);
		zixishileixing = zixishileixingService.selectView(new EntityWrapper<ZixishileixingEntity>().eq("id", id));
        return R.ok().put("data", zixishileixing);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZixishileixingEntity zixishileixing = zixishileixingService.selectById(id);
		zixishileixing = zixishileixingService.selectView(new EntityWrapper<ZixishileixingEntity>().eq("id", id));
        return R.ok().put("data", zixishileixing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZixishileixingEntity zixishileixing, HttpServletRequest request){
    	zixishileixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zixishileixing);
        zixishileixingService.insert(zixishileixing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZixishileixingEntity zixishileixing, HttpServletRequest request){
    	zixishileixing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zixishileixing);
        zixishileixingService.insert(zixishileixing);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ZixishileixingEntity zixishileixing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zixishileixing);
        zixishileixingService.updateById(zixishileixing);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zixishileixingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
