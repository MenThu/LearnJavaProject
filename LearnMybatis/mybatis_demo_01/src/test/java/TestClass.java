import com.menthuguan.mybatis.mapper.TbBrandMapper;
import com.menthuguan.mybatis.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;


public class TestClass {
    @Test
    public void testSelect() throws IOException {
        SqlSession sqlSession = getSqlSession();
        TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
        Brand brand = mapper.selectBrandById(2);
        System.out.println(brand);
    }

    public SqlSession getSqlSession() throws IOException {
        InputStream asStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(asStream);
        return sqlSessionFactory.openSession(true);
    }
}
