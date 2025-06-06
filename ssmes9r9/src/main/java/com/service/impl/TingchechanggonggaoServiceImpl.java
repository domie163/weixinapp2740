package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.TingchechanggonggaoDao;
import com.entity.TingchechanggonggaoEntity;
import com.service.TingchechanggonggaoService;
import com.entity.vo.TingchechanggonggaoVO;
import com.entity.view.TingchechanggonggaoView;

@Service("tingchechanggonggaoService")
public class TingchechanggonggaoServiceImpl extends ServiceImpl<TingchechanggonggaoDao, TingchechanggonggaoEntity> implements TingchechanggonggaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TingchechanggonggaoEntity> page = this.selectPage(
                new Query<TingchechanggonggaoEntity>(params).getPage(),
                new EntityWrapper<TingchechanggonggaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TingchechanggonggaoEntity> wrapper) {
		  Page<TingchechanggonggaoView> page =new Query<TingchechanggonggaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TingchechanggonggaoVO> selectListVO(Wrapper<TingchechanggonggaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TingchechanggonggaoVO selectVO(Wrapper<TingchechanggonggaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TingchechanggonggaoView> selectListView(Wrapper<TingchechanggonggaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TingchechanggonggaoView selectView(Wrapper<TingchechanggonggaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
