package com.denis.efficiency.service;

import com.denis.efficiency.dao.WordDao;
import com.denis.efficiency.model.Word;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class WordServiceImpl implements WordService {
    @Autowired
    private WordDao wordDao;

    @Override
    public List<Word> getNPairsOfRandomWords(int n) {
        Set<Word> words = new HashSet<>();
        List<Word> allWords = (ArrayList<Word>) wordDao.findAll();

        if (n > allWords.size()) {
            n = allWords.size();
        }

        while (words.size() < n) {
            Word word = allWords.get((int) (Math.random() * allWords.size()));
            words.add(word);
        }

        return new ArrayList<>(words);
    }

    @Override
    public List<Word> getNPairsOfWords(int n) {
        List<Word> words = (List<Word>) wordDao.findAll();
        List<Word> output = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            output.add(words.get(i));
        }

        return output;
    }

    @Override
    public List<Word> getAllWords() {
        return (List<Word>) wordDao.findAll();
    }

    @Override
    public void saveWord(Word word) {
        wordDao.save(word);
    }

    @Override
    public void deleteWordById(Long id) {
        wordDao.deleteById(id);
    }
}
