package me.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by dell on 2017/7/24.
 * 获取SqlSessionFactory
 */
@SuppressWarnings("All")
public class SqlSessionFactoryUtils {
    private static SqlSessionFactory sqlSessionFactory;

    private static final Class Class_Lock=SqlSessionFactoryUtils.class;//一个数据库对应一个SqlSessionFactory

    private SqlSessionFactoryUtils(){//私有化构造方法

    }

    public static SqlSessionFactory initSqlSessionFactory(){
       String resource="mybatis-config.xml";
       InputStream inputStream=null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
        } catch (IOException e) {
            Logger.getLogger(SqlSessionFactoryUtils.class.getName()).log(Level.SEVERE,null,e);
        }
        synchronized (Class_Lock){
            if(sqlSessionFactory==null){
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            }
        }
        return sqlSessionFactory;
    }

    public static SqlSession openSession(){
        if (sqlSessionFactory==null){
            initSqlSessionFactory();
        }
        SqlSession sqlSession = sqlSessionFactory.openSession();
        return sqlSession;
    }
}
