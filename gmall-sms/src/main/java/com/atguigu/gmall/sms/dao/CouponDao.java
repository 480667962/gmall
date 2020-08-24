package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author feifei
 * @email 480667962@qq.com
 * @date 2020-08-24 16:56:22
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
