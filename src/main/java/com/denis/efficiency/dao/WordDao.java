package com.denis.efficiency.dao;

import com.denis.efficiency.model.Word;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordDao extends CrudRepository<Word, Long> {
    void deleteById(Long id);
}
