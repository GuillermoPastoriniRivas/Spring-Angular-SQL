package com.JavaApp.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JavaApp.bookstore.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long>{

}
