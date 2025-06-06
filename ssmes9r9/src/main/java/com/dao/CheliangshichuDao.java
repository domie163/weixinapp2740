package com.dao;

import com.entity.CheliangshichuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheliangshichuVO;
import com.entity.view.CheliangshichuView;


/**
 * 车辆驶出
 * 
 * @author 
 * @email 
 * @date 2021-04-28 10:50:51
 */
public interface CheliangshichuDao extends BaseMapper<CheliangshichuEntity> {
	
	List<CheliangshichuVO> selectListVO(@Param("ew") Wrapper<CheliangshichuEntity> wrapper);
	
	CheliangshichuVO selectVO(@Param("ew") Wrapper<CheliangshichuEntity> wrapper);
	
	List<CheliangshichuView> selectListView(@Param("ew") Wrapper<CheliangshichuEntity> wrapper);

	List<CheliangshichuView> selectListView(Pagination page,@Param("ew") Wrapper<CheliangshichuEntity> wrapper);
	
	CheliangshichuView selectView(@Param("ew") Wrapper<CheliangshichuEntity> wrapper);
	
}
