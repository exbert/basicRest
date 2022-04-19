package com.action.rest_mysql_02.repository

import com.action.rest_mysql_02.model.Post
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface PostRepository : JpaRepository<Post, Long>