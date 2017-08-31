package me.mybatis.demo;

import me.mybatis.mapper.StudentMapper;
import me.mybatis.mapper.TestMapper;
import me.mybatis.po.*;
import me.mybatis.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dell on 2017/8/16.
 */
public class Demo2 {

    public static void main(String[] args) {
//        ServiceMapper sm=new ServiceMapperImpl();
//        ServiceMapperProxy serviceMapperProxy=new ServiceMapperProxy(sm);
//        ServiceMapperProxy serviceMapperProxy=new ServiceMapperProxy();
//        ServiceMapper proxyInstance=(ServiceMapper) Proxy.newProxyInstance(ServiceMapper.class.getClassLoader(),new Class[]{ServiceMapper.class},serviceMapperProxy);
//        proxyInstance.sayHello("tomcat");
    }

    public static void test(){
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        try {
            TestMapper testMapper = sqlSession.getMapper(TestMapper.class);
            TestExample testExample=new TestExample();
            TestExample.Criteria criteria = testExample.createCriteria();
            criteria.andIdEqualTo("01").andIdIsNotNull();
            criteria.andAppsEqualTo("app01");
            List<Test> tests = testMapper.selectByExample(testExample);
            System.out.println(tests);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally{
            sqlSession.close();
        }
    }

    public static void test1(){
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> students = studentMapper.selectBySno("01");
            List<Score> scores = students.get(0).getScores();
            System.out.println("student:"+students+"scores:"+scores);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally{
            sqlSession.close();
        }
    }

    public static void test2(){
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            StudentExample studentExample=new StudentExample();
            studentExample.createCriteria().andSnoEqualTo(new BigDecimal("03"));
            Student student=new Student();
            student.setSage("20");
            studentMapper.updateByExampleSelective(student,studentExample);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally{
            sqlSession.close();
        }
    }

    public static void test3(){
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        try {
            TestMapper testMapper = sqlSession.getMapper(TestMapper.class);
            Test test=new Test();
            test.setApps("app01");
            TestExample testExample=new TestExample();
            TestExample.Criteria criteria = testExample.createCriteria().andIdEqualTo("01");
            int i = testMapper.updateByExample(test, testExample);
            System.out.println(i);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally{
            sqlSession.close();
        }
    }

    public static void test4(){
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            Student student = new Student();
            student.setSage("25");
            int i = studentMapper.insertStudent(student);
            System.out.println(i);

            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally{
            sqlSession.close();
        }
    }

    public static void test5(){
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> students=new ArrayList<>(10);
            students.add(new Student("21","21","",""));
            students.add(new Student("22","22","",""));
            students.add(new Student("23","23","",""));
            int i = studentMapper.insertManyStudent(students);
            System.out.println(i);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally{
            sqlSession.close();
        }
    }

    public static void test6(){
        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            int i = studentMapper.deleteAny(new int[]{19, 20, 21});
            System.out.println(i);
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
            sqlSession.rollback();
        }finally{
            sqlSession.close();
        }
    }
}
