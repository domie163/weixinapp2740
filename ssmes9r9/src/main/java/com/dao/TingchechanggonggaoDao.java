package com.dao;

import com.entity.TingchechanggonggaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TingchechanggonggaoVO;
import com.entity.view.TingchechanggonggaoView;


/**
 * 停车场公告
 * 
 * @author 
 * @email 
 * @date 2021-04-28 10:50:51
 */
public interface TingchechanggonggaoDao extends BaseMapper<TingchechanggonggaoEntity> {
	
	List<TingchechanggonggaoVO> selectListVO(@Param("ew") Wrapper<TingchechanggonggaoEntity> wrapper);
	
	TingchechanggonggaoVO selectVO(@Param("ew") Wrapper<TingchechanggonggaoEntity> wrapper);
	
	List<TingchechanggonggaoView> selectListView(@Param("ew") Wrapper<TingchechanggonggaoEntity> wrapper);

	List<TingchechanggonggaoView> selectListView(Pagination page,@Param("ew") Wrapper<TingchechanggonggaoEntity> wrapper);
	
	TingchechanggonggaoView selectView(@Param("ew") Wrapper<TingchechanggonggaoEntity> wrapper);
	
}
