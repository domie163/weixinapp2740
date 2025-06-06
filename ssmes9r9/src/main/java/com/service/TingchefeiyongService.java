package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TingchefeiyongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TingchefeiyongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TingchefeiyongView;


/**
 * 停车费用
 *
 * @author 
 * @email 
 * @date 2021-04-28 10:50:51
 */
public interface TingchefeiyongService extends IService<TingchefeiyongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TingchefeiyongVO> selectListVO(Wrapper<TingchefeiyongEntity> wrapper);
   	
   	TingchefeiyongVO selectVO(@Param("ew") Wrapper<TingchefeiyongEntity> wrapper);
   	
   	List<TingchefeiyongView> selectListView(Wrapper<TingchefeiyongEntity> wrapper);
   	
   	TingchefeiyongView selectView(@Param("ew") Wrapper<TingchefeiyongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TingchefeiyongEntity> wrapper);
   	
}

