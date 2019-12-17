package hello.dao;

import hello.entity.RankItem;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RankDao {
    @Autowired
    private SqlSession sqlSession;
    public List<RankItem> getRank(){
        return sqlSession.selectList("MyMapper.selectRank");
    }
}
