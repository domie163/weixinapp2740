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


import com.dao.TingchefeiyongDao;
import com.entity.TingchefeiyongEntity;
import com.service.TingchefeiyongService;
import com.entity.vo.TingchefeiyongVO;
import com.entity.view.TingchefeiyongView;

@Service("tingchefeiyongService")
public class TingchefeiyongServiceImpl extends ServiceImpl<TingchefeiyongDao, TingchefeiyongEntity> implements TingchefeiyongService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<TingchefeiyongEntity> page = this.selectPage(
                new Query<TingchefeiyongEntity>(params).getPage(),
                new EntityWrapper<TingchefeiyongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<TingchefeiyongEntity> wrapper) {
		  Page<TingchefeiyongView> page =new Query<TingchefeiyongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<TingchefeiyongVO> selectListVO(Wrapper<TingchefeiyongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public TingchefeiyongVO selectVO(Wrapper<TingchefeiyongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<TingchefeiyongView> selectListView(Wrapper<TingchefeiyongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public TingchefeiyongView selectView(Wrapper<TingchefeiyongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
