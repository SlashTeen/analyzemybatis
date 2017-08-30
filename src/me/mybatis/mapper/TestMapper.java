package me.mybatis.mapper;

import me.mybatis.po.Test;
import me.mybatis.po.TestExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by dell on 2017/8/16.
 */
public interface TestMapper {

    int countByExample(TestExample example);

    int deleteByExample(TestExample example);

    int insert(Test record);

    int insertSelective(Test record);

    List<Test> selectByExample(TestExample example);//测试使用

    int updateByExampleSelective(@Param("record") Test record, @Param("example") TestExample example);

    int updateByExample(@Param("record") Test record,@Param("example") TestExample example);
}
