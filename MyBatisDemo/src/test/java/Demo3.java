import com.test.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import pojo.Room;
import pojo.Teacher;
import pojo.User;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Demo3 {

    @Test
    public void test01() throws IOException {
        //1.创建SqlSessionFactory
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //2.创建SqlSession
        SqlSession session = factory.openSession();
        //3.调用sql得到结果
        List<User> list = session.selectList("com.test.mapper.UserMapper.selectAll");
        session.commit();
        //4.处理结果
        System.out.println(list);
        SqlSession session2 = factory.openSession();
        List<Room> list2 = session2.selectList("com.test.mapper.UserMapper.selectAll");
        session2.commit();
        //4.处理结果
        System.out.println(list2);
    }

    @Test
    public void test02() throws IOException {
        //1.创建SqlSessionFactory
        InputStream in = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        //2.创建SqlSession
        SqlSession session = factory.openSession();

        UserMapper mapper = session.getMapper(UserMapper.class);
        System.out.println(mapper.getClass());

        //User user = (User) mapper.queryOne(1);
        List<User> list = mapper.queryOne(5);
        //4.处理结果
        System.out.println(list);
    }
}
