package com.dev.account.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author IT云清
 */
@Mapper
public interface AccountDao {

    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 金额
     */
    void decrease(@Param("userId") Integer userId, @Param("money") BigDecimal money);
}
