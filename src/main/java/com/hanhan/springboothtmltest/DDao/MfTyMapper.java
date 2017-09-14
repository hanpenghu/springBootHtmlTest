package com.hanhan.springboothtmltest.DDao;

import java.util.List;
import com.hanhan.springboothtmltest.EDto.MfTy;
import com.hanhan.springboothtmltest.EDto.MfTyExample;
import com.hanhan.springboothtmltest.EDto.MfTyKey;
import org.apache.ibatis.annotations.Param;

public interface MfTyMapper {
    long countByExample(MfTyExample example);

    int deleteByExample(MfTyExample example);

    int deleteByPrimaryKey(MfTyKey key);

    int insert(MfTy record);

    int insertSelective(MfTy record);

    List<MfTy> selectByExampleWithBLOBs(MfTyExample example);

    List<MfTy> selectByExample(MfTyExample example);

    MfTy selectByPrimaryKey(MfTyKey key);

    int updateByExampleSelective(@Param("record") MfTy record, @Param("example") MfTyExample example);

    int updateByExampleWithBLOBs(@Param("record") MfTy record, @Param("example") MfTyExample example);

    int updateByExample(@Param("record") MfTy record, @Param("example") MfTyExample example);

    int updateByPrimaryKeySelective(MfTy record);

    int updateByPrimaryKeyWithBLOBs(MfTy record);

    int updateByPrimaryKey(MfTy record);
}