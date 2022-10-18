package com.digitalbook.author.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.digitalbook.author.entity.AuthorBook;

public interface AuthorBookRepository extends JpaRepository<AuthorBook, String>{

	static Optional<AuthorBook> findById(int authorid) {
		// TODO Auto-generated method stub
		return null;
	}

}
