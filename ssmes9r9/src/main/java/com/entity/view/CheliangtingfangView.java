package com.entity.view;

import com.entity.CheliangtingfangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车辆停放
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-28 10:50:51
 */
@TableName("cheliangtingfang")
public class CheliangtingfangView  extends CheliangtingfangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheliangtingfangView(){
	}
 
 	public CheliangtingfangView(CheliangtingfangEntity cheliangtingfangEntity){
 	try {
			BeanUtils.copyProperties(this, cheliangtingfangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
