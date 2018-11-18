package com.example.mybatisreverse.mapper;

import com.example.mybatisreverse.model.PayRecord;
import com.example.mybatisreverse.model.PayRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayRecordMapper {
    int countByExample(PayRecordExample example);

    int deleteByExample(PayRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PayRecord record);

    int insertSelective(PayRecord record);

    List<PayRecord> selectByExampleWithBLOBs(PayRecordExample example);

    List<PayRecord> selectByExample(PayRecordExample example);

    PayRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PayRecord record, @Param("example") PayRecordExample example);

    int updateByExampleWithBLOBs(@Param("record") PayRecord record, @Param("example") PayRecordExample example);

    int updateByExample(@Param("record") PayRecord record, @Param("example") PayRecordExample example);

    int updateByPrimaryKeySelective(PayRecord record);

    int updateByPrimaryKeyWithBLOBs(PayRecord record);

    int updateByPrimaryKey(PayRecord record);
}