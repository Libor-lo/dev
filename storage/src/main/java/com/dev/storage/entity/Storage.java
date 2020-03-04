package com.dev.storage.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author IT云清
 */
@Data
public class Storage {

    @TableId(type = IdType.AUTO)
    private Integer id;

    /**产品id*/
    private Integer productId;

    /**总库存*/
    private Integer total;

    /**已用库存*/
    private Integer used;

    /**剩余库存*/
    private Integer residue;
}
