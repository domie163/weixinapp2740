package com.entity.view;

import com.entity.TingchefeiyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 停车费用
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 10:50:51
 */
@TableName("tingchefeiyong")
public class TingchefeiyongView  extends TingchefeiyongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TingchefeiyongView(){
	}
 
 	public TingchefeiyongView(TingchefeiyongEntity tingchefeiyongEntity){
 	try {
			BeanUtils.copyProperties(this, tingchefeiyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
