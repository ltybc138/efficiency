package com.denis.efficiency;

import com.denis.efficiency.dao.WordDao;
import com.denis.efficiency.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private WordDao wordDao;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        wordDao.save(new Word("Apple", "Щедевр"));
        wordDao.save(new Word("Microsoft", "Дерьмо"));
        wordDao.save(new Word("Intel", "Норм"));
        wordDao.save(new Word("AMD", "Assholes"));
    }
}
