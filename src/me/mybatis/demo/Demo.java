package me.mybatis.demo;

/**
 * Created by dell on 2017/7/19.
 */
public class Demo{

//    public static void oneAssociationMany(){
//        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
//        try {
//            MybatisDeptMapper mybatisDeptMapper = sqlSession.getMapper(MybatisDeptMapper.class);
//            MybatisDept dept01 = mybatisDeptMapper.getDeptInfo("dept01");
//            List<MybatisUser> userList = dept01.getUserList();
//            MybatisUser mybatisUser = userList.get(0);
//            System.out.println(mybatisUser.toString());
//            sqlSession.commit();
//        }catch (Exception e){
//            e.printStackTrace();
//            sqlSession.rollback();
//        }finally{
//            sqlSession.close();
//        }
//    }
//
//    public static void oneAssociationOne(){
//        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
//        try {
//            MybatisDeptMapper mybatisDeptMapper = sqlSession.getMapper(MybatisDeptMapper.class);
//            MybatisDept dept01 = mybatisDeptMapper.getDeptInfo("dept01");
//            MybatisSalesAmount salesAmount = dept01.getSalesAmount();
//            System.out.println(salesAmount);
//            sqlSession.commit();
//        }catch (Exception e){
//            e.printStackTrace();
//            sqlSession.rollback();
//        }finally{
//            sqlSession.close();
//        }
//    }
//
//    public static void addOne(){
//        SqlSession sqlSession = SqlSessionFactoryUtils.openSession();
//        try {
//            MybatisDeptMapper mybatisDeptMapper = sqlSession.getMapper(MybatisDeptMapper.class);
//            MybatisDept mybatisDept=new MybatisDept();
//            mybatisDept.setDeptName("部门04");
//            mybatisDeptMapper.insertADept(mybatisDept);
//            sqlSession.commit();
//        }catch (Exception e){
//            e.printStackTrace();
//            sqlSession.rollback();
//        }finally{
//            sqlSession.close();
//        }
//    }
//
//    public static void main(String[] args) {
////        oneAssociationMany();
////        oneAssociationOne();
//        addOne();
//    }
}
