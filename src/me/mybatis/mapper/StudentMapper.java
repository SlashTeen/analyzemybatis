package me.mybatis.mapper;

import me.mybatis.po.Student;
import me.mybatis.po.StudentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteAny(int[] snos);//测试删除

    int insert(Student record);

    int insertStudent(Student student);//测试主键自动生成

    int insertManyStudent(List<Student> list);//测试批量插入

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    List<Student> selectBySno(String sno);//关联查询

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);
}