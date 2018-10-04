package com.denis.efficiency.controller;
import com.denis.efficiency.model.Word;
import com.denis.efficiency.service.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/main")
@CrossOrigin
public class MainController {
    @Autowired
    private WordService wordService;

    @RequestMapping(path = "/words/{n}", method = RequestMethod.GET)
    public List<Word> getNRandomWords(@PathVariable(name = "n") int n) {
        return wordService.getNPairsOfRandomWords(n);
    }

//    @RequestMapping(path = "/words/{n}", method = RequestMethod.GET)
//    public List<Word> getNWords(@PathVariable(name = "n") int n) {
//        return wordService.getNPairsOfRandomWords(n);
//    }

    @RequestMapping(path = "/words", method = RequestMethod.GET)
    public List<Word> getAllWordPairs() {
        return wordService.getAllWords();
    }

    @RequestMapping(path = "/word", method = RequestMethod.POST)
    public void saveWord(@RequestBody Word word) {
        wordService.saveWord(word);
    }

    @RequestMapping(path = "/word/{n}", method = RequestMethod.DELETE)
    public void deleteWordById(@PathVariable(name = "n") long n) {
        wordService.deleteWordById(n);
    }
}
