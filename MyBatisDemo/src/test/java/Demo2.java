import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Demo2 {

    @Test
    public void test01() throws IOException {
        //1.创建SqlSessionFactory
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //2.创建SqlSession
        SqlSession session = factory.openSession();
        //3.调用sql得到结果
        List<Grade> list = session.selectList("com.test.mapper.o2oMapper.O2O1");
        //4.处理结果
        System.out.println(list);

    }

    @Test
    public void test02() throws IOException {
        //1.创建SqlSessionFactory
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //2.创建SqlSession
        SqlSession session = factory.openSession();
        //3.调用sql得到结果
        List<Dept> list = session.selectList("com.test.mapper.o2oMapper.O2m1");
        //4.处理结果
        System.out.println(list);

    }

    @Test
    public void test03() throws IOException {
        //1.创建SqlSessionFactory
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //2.创建SqlSession
        SqlSession session = factory.openSession();
        //3.调用sql得到结果
        List<Emp> list = session.selectList("com.test.mapper.o2oMapper.O2m2");
        //4.处理结果
        System.out.println(list);

    }

    @Test
    public void test04() throws IOException {
        //1.创建SqlSessionFactory
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //2.创建SqlSession
        SqlSession session = factory.openSession();
        //3.调用sql得到结果
        List<Teacher> list = session.selectList("com.test.mapper.o2oMapper.O2m3");
        //4.处理结果
        System.out.println(list);

    }



}
