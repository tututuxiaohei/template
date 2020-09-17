package com.mzx.template.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author mazhenxing
 */
@Data
@TableName("voter_info")
public class VoterInfoEntity {

    private Long id;
    private String name;
}
