package com.nowcoder.community.dao;


import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper

public interface DiscussPostMapper {

    // offset 起始行行号  limit 页面最多显示多少条数据
    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    // 查询帖子的行数
    // @Param注解用于给参数取别名
    // 当需要动态拼条件时，且该条件只有一个参数，并且在<if>里使用，必须用@Param加别名
    int selectDiscussPostRows (@Param("userId") int userId);

}
