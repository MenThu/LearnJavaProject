import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import com.menthuguan.mybatis.mapper.TbBrandMapper;
import com.menthuguan.mybatis.pojo.Brand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class TestMybatisPlusClass {
    @Test
    public void testSelect() throws IOException {
        SqlSession sqlSession = getSqlSession();
        TbBrandMapper mapper = sqlSession.getMapper(TbBrandMapper.class);
//        Brand brand = mapper.selectBrandById(2);
        List<Brand> brands = mapper.selectList(null);
        System.out.println(brands);
    }

    public SqlSession getSqlSession() throws IOException {
        InputStream asStream = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
//        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(asStream);


        MybatisSqlSessionFactoryBuilder sessionFactoryBuilder = new MybatisSqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sessionFactoryBuilder.build(asStream);


        return sqlSessionFactory.openSession(true);
    }
}
