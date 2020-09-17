package com.mzx.template.service;

import com.mzx.template.entity.VoterInfoEntity;

/**
 * @author mazhenxing
 */
public interface TestService {

    VoterInfoEntity findById(Long id);

    void insert(VoterInfoEntity voterInfoEntity);
}
