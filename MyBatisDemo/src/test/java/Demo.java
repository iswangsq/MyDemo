import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Demo {

    @Test
    public void test01() throws IOException {
        //1.创建SqlSessionFactory
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //2.创建SqlSession
        SqlSession session = factory.openSession();
        //3.调用sql得到结果
        List<User> list = session.selectList("com.test.mapper.UserMapper.select01");
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
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("min", 13);
        map.put("max", 14);

        List<User> list = session.selectList("com.test.mapper.UserMapper.queryRange",map);
        //4.处理结果
        System.out.println(Arrays.toString(list.toArray()));

    }

    @Test
    public void test03() throws IOException {
        //1.创建SqlSessionFactory
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //2.创建SqlSession
        SqlSession session = factory.openSession();
        //3.调用sql得到结果
        User user = new User();
        user.setAge(16);
        user.setId(4);
        user.setName("eee");

        int rs = session.insert("com.test.mapper.UserMapper.inserUser",user);
        session.commit();
        //4.处理结果
        System.out.println(rs);

    }

    @Test
    public void test04() throws IOException {
        //1.创建SqlSessionFactory
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //2.创建SqlSession
        SqlSession session = factory.openSession();

        User user = session.selectOne("com.test.mapper.UserMapper.queryOne",3);

        //4.处理结果
        System.out.println(user);

    }

    @Test
    public void test05() throws IOException {
        //1.创建SqlSessionFactory
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //2.创建SqlSession
        SqlSession session = factory.openSession();
        User user = new User();
        user.setId(3);
        user.setName("viv");
        user.setAge(10);
        int rs = session.update("com.test.mapper.UserMapper.updateOne",user);
        session.commit();
        //4.处理结果
        System.out.println(rs);

    }

    @Test
    public void test06() throws IOException {
        //1.创建SqlSessionFactory
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //2.创建SqlSession
        SqlSession session = factory.openSession();
        User user = new User();
        user.setId(1);
        user.setName("aaa");
        user.setAge(13);
        User userx = session.selectOne("com.test.mapper.UserMapper.queryMany",user);

        //4.处理结果
        System.out.println(userx);

    }

    @Test
    public void test07() throws IOException {
        //1.创建SqlSessionFactory
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //2.创建SqlSession
        SqlSession session = factory.openSession();
        User user = new User();
        user.setName("opq");
        user.setAge(33);
        int rs = session.update("com.test.mapper.UserMapper.insertOne",user);
        session.commit();
        //4.处理结果
        System.out.println(rs);

    }

    @Test
    public void test08() throws IOException {
        //1.创建SqlSessionFactory
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //2.创建SqlSession
        SqlSession session = factory.openSession();

        int rs = session.delete("com.test.mapper.UserMapper.deleteOne");
        session.commit();
        //4.处理结果
        System.out.println(rs);

    }

    @Test
    public void test09() throws IOException {
        //1.创建SqlSessionFactory
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //2.创建SqlSession
        SqlSession session = factory.openSession();
        List<Integer> ul = new ArrayList<Integer>();
        ul.add(1);
        ul.add(2);
        ul.add(3);
        ul.add(4);
        int rs = session.delete("com.test.mapper.UserMapper.delete2",ul);
        session.commit();
        //4.处理结果
        System.out.println(rs);

    }

    /**
     * 手动映射结果集
     * @throws IOException
     */
    @Test
    public void test10() throws IOException {
        //1.创建SqlSessionFactory
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //2.创建SqlSession
        SqlSession session = factory.openSession();
        List<User> ul = session.selectList("com.test.mapper.UserMapper.select01");


        //4.处理结果
        System.out.println(ul);

    }



}
