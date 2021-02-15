package com.ssafy.sns.dto.newsfeed;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
@NoArgsConstructor
public class WorkerRequestDto extends FeedRequestDto {

    @Builder
    public WorkerRequestDto(String content, String file, List<String> tags) {
        super(content, null, tags);
    }
}
