package com.ssafy.sns.repository;

import com.ssafy.sns.domain.hashtag.IndoorHashtag;
import com.ssafy.sns.domain.newsfeed.Indoor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IndoorHashtagRepository extends JpaRepository<IndoorHashtag, Long> {

    List<IndoorHashtag> findIndoorHashtagByHashtagTagName(String tagName);
}
