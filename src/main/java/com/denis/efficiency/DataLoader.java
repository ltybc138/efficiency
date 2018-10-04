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
        wordDao.save(new Word("Apple", "Яблоко"));
        wordDao.save(new Word("Orange", "Апельсин"));
        wordDao.save(new Word("Banana", "Банан"));
        wordDao.save(new Word("Coconut", "Какос"));
        wordDao.save(new Word("Nuts", "Орешки"));
        wordDao.save(new Word("Coffee", "Кофе"));
        wordDao.save(new Word("Tea", "Чай"));
    }
}
