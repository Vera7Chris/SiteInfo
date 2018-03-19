package com.huanuo.npo.Dao;

import com.huanuo.npo.pojo.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
