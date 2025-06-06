package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CheliangtingfangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CheliangtingfangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CheliangtingfangView;


/**
 * 车辆停放
 *
 * @author 
 * @email 
 * @date 2021-04-28 10:50:51
 */
public interface CheliangtingfangService extends IService<CheliangtingfangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CheliangtingfangVO> selectListVO(Wrapper<CheliangtingfangEntity> wrapper);
   	
   	CheliangtingfangVO selectVO(@Param("ew") Wrapper<CheliangtingfangEntity> wrapper);
   	
   	List<CheliangtingfangView> selectListView(Wrapper<CheliangtingfangEntity> wrapper);
   	
   	CheliangtingfangView selectView(@Param("ew") Wrapper<CheliangtingfangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CheliangtingfangEntity> wrapper);
   	
}

