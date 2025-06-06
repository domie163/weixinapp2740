package com.entity.view;

import com.entity.TingchechanggonggaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 停车场公告
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 10:50:51
 */
@TableName("tingchechanggonggao")
public class TingchechanggonggaoView  extends TingchechanggonggaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TingchechanggonggaoView(){
	}
 
 	public TingchechanggonggaoView(TingchechanggonggaoEntity tingchechanggonggaoEntity){
 	try {
			BeanUtils.copyProperties(this, tingchechanggonggaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
