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


import com.dao.CheliangshichuDao;
import com.entity.CheliangshichuEntity;
import com.service.CheliangshichuService;
import com.entity.vo.CheliangshichuVO;
import com.entity.view.CheliangshichuView;

@Service("cheliangshichuService")
public class CheliangshichuServiceImpl extends ServiceImpl<CheliangshichuDao, CheliangshichuEntity> implements CheliangshichuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangshichuEntity> page = this.selectPage(
                new Query<CheliangshichuEntity>(params).getPage(),
                new EntityWrapper<CheliangshichuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangshichuEntity> wrapper) {
		  Page<CheliangshichuView> page =new Query<CheliangshichuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheliangshichuVO> selectListVO(Wrapper<CheliangshichuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangshichuVO selectVO(Wrapper<CheliangshichuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangshichuView> selectListView(Wrapper<CheliangshichuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangshichuView selectView(Wrapper<CheliangshichuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
