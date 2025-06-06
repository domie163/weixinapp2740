package com.dao;

import com.entity.CheliangtingfangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangtingfangVO;
import com.entity.view.CheliangtingfangView;


/**
 * 车辆停放
 * 
 * @author 
 * @email 
 * @date 2021-04-28 10:50:51
 */
public interface CheliangtingfangDao extends BaseMapper<CheliangtingfangEntity> {
	
	List<CheliangtingfangVO> selectListVO(@Param("ew") Wrapper<CheliangtingfangEntity> wrapper);
	
	CheliangtingfangVO selectVO(@Param("ew") Wrapper<CheliangtingfangEntity> wrapper);
	
	List<CheliangtingfangView> selectListView(@Param("ew") Wrapper<CheliangtingfangEntity> wrapper);

	List<CheliangtingfangView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangtingfangEntity> wrapper);
	
	CheliangtingfangView selectView(@Param("ew") Wrapper<CheliangtingfangEntity> wrapper);
	
}
