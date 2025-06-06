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


import com.dao.CheliangtingfangDao;
import com.entity.CheliangtingfangEntity;
import com.service.CheliangtingfangService;
import com.entity.vo.CheliangtingfangVO;
import com.entity.view.CheliangtingfangView;

@Service("cheliangtingfangService")
public class CheliangtingfangServiceImpl extends ServiceImpl<CheliangtingfangDao, CheliangtingfangEntity> implements CheliangtingfangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheliangtingfangEntity> page = this.selectPage(
                new Query<CheliangtingfangEntity>(params).getPage(),
                new EntityWrapper<CheliangtingfangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheliangtingfangEntity> wrapper) {
		  Page<CheliangtingfangView> page =new Query<CheliangtingfangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheliangtingfangVO> selectListVO(Wrapper<CheliangtingfangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheliangtingfangVO selectVO(Wrapper<CheliangtingfangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheliangtingfangView> selectListView(Wrapper<CheliangtingfangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheliangtingfangView selectView(Wrapper<CheliangtingfangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
