package com.denis.efficiency.service;

import com.denis.efficiency.model.Word;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WordService {
    List<Word> getNPairsOfRandomWords(int n);
    List<Word> getNPairsOfWords(int n);
    List<Word> getAllWords();
    void saveWord(Word word);
    void deleteWordById(Long id);
}
