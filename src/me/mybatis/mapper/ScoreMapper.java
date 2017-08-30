package me.mybatis.mapper;

import me.mybatis.po.Score;
import me.mybatis.po.ScoreExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScoreMapper {
    int countByExample(ScoreExample example);

    int deleteByExample(ScoreExample example);

    int insert(Score record);

    int insertSelective(Score record);

    List<Score> selectByExample(ScoreExample example);

    List<Score> selectBySno(String sno);//关联查询

    int updateByExampleSelective(@Param("record") Score record, @Param("example") ScoreExample example);

    int updateByExample(@Param("record") Score record, @Param("example") ScoreExample example);


}