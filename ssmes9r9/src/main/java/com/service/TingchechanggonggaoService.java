package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.TingchechanggonggaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.TingchechanggonggaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.TingchechanggonggaoView;


/**
 * 停车场公告
 *
 * @author 
 * @email 
 * @date 2021-04-28 10:50:51
 */
public interface TingchechanggonggaoService extends IService<TingchechanggonggaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<TingchechanggonggaoVO> selectListVO(Wrapper<TingchechanggonggaoEntity> wrapper);
   	
   	TingchechanggonggaoVO selectVO(@Param("ew") Wrapper<TingchechanggonggaoEntity> wrapper);
   	
   	List<TingchechanggonggaoView> selectListView(Wrapper<TingchechanggonggaoEntity> wrapper);
   	
   	TingchechanggonggaoView selectView(@Param("ew") Wrapper<TingchechanggonggaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<TingchechanggonggaoEntity> wrapper);
   	
}

