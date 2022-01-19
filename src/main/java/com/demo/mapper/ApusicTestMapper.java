package com.demo.mapper;

import com.demo.model.ApusicTest;
import com.demo.model.ApusicTestExample;
import java.util.List;

import com.demo.my.mapper.MyMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.entity.Example;
@Repository
public interface ApusicTestMapper extends MyMapper<ApusicTest> {
    long countByExample(ApusicTestExample example);

    int deleteByExample(ApusicTestExample example);

    int deleteByPrimaryKey(Integer ID);

    int insert(ApusicTest record);

    int insertSelective(ApusicTest record);

    List<ApusicTest> selectByExample(Example example);

    ApusicTest selectByPrimaryKey(Integer ID);

    int updateByExampleSelective(@Param("record") ApusicTest record, @Param("example") ApusicTestExample example);

    int updateByExample(@Param("record") ApusicTest record, @Param("example") ApusicTestExample example);

    int updateByPrimaryKeySelective(ApusicTest record);

    int updateByPrimaryKey(ApusicTest record);
}