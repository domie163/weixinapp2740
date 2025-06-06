package com.dao;

import com.entity.TingchefeiyongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.TingchefeiyongVO;
import com.entity.view.TingchefeiyongView;


/**
 * 停车费用
 * 
 * @author 
 * @email 
 * @date 2021-04-28 10:50:51
 */
public interface TingchefeiyongDao extends BaseMapper<TingchefeiyongEntity> {
	
	List<TingchefeiyongVO> selectListVO(@Param("ew") Wrapper<TingchefeiyongEntity> wrapper);
	
	TingchefeiyongVO selectVO(@Param("ew") Wrapper<TingchefeiyongEntity> wrapper);
	
	List<TingchefeiyongView> selectListView(@Param("ew") Wrapper<TingchefeiyongEntity> wrapper);

	List<TingchefeiyongView> selectListView(Pagination page,@Param("ew") Wrapper<TingchefeiyongEntity> wrapper);
	
	TingchefeiyongView selectView(@Param("ew") Wrapper<TingchefeiyongEntity> wrapper);
	
}
