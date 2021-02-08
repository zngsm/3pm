package com.ssafy.sns.service;

import com.ssafy.sns.domain.hashtag.Hashtag;
import com.ssafy.sns.domain.newsfeed.Feed;
import com.ssafy.sns.domain.newsfeed.Indoor;
import com.ssafy.sns.domain.user.User;
import com.ssafy.sns.dto.newsfeed.FeedResponseDto;
import com.ssafy.sns.dto.user.SimpleUserDto;

import java.util.List;

public interface SearchService {

    public List<Hashtag> searchHashtags(String keyword);

    public List<FeedResponseDto> searchFeeds(Hashtag hash);

    public List<SimpleUserDto> searchUsers(String keyword);
}
