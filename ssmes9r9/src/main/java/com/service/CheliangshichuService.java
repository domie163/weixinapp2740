package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangshichuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangshichuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangshichuView;


/**
 * 车辆驶出
 *
 * @author 
 * @email 
 * @date 2021-04-28 10:50:51
 */
public interface CheliangshichuService extends IService<CheliangshichuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangshichuVO> selectListVO(Wrapper<CheliangshichuEntity> wrapper);
   	
   	CheliangshichuVO selectVO(@Param("ew") Wrapper<CheliangshichuEntity> wrapper);
   	
   	List<CheliangshichuView> selectListView(Wrapper<CheliangshichuEntity> wrapper);
   	
   	CheliangshichuView selectView(@Param("ew") Wrapper<CheliangshichuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangshichuEntity> wrapper);
   	
}

