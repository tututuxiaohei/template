package com.mzx.template.service.impl;

import com.mzx.template.dao.VoterInfoMapper;
import com.mzx.template.entity.VoterInfoEntity;
import com.mzx.template.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author mazhenxing
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private VoterInfoMapper voterInfoMapper;

    @Override
    public VoterInfoEntity findById(Long id) {
        return voterInfoMapper.selectById(id);
    }

    @Override
    public void insert(VoterInfoEntity voterInfoEntity) {
        voterInfoMapper.insert(voterInfoEntity);
    }
}
