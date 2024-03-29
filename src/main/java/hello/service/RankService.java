package hello.service;

import hello.dao.RankDao;
import hello.dao.UserMapper;
import hello.entity.RankItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private RankDao rankDao;

    public List<RankItem> getRank() {
        return rankDao.getRank();
    }
}
