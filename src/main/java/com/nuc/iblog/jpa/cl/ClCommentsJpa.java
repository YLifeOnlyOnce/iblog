package com.nuc.iblog.jpa.cl;


import com.nuc.iblog.entity.Article;
import com.nuc.iblog.entity.Category;
import com.nuc.iblog.entity.Comments;
import com.nuc.iblog.jpa.BaseJpa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

/**
 * @Author hao
 * @Date 2018/1/9 13:27
 * @Description : 文章评论jpa接口
 */
@NoRepositoryBean
public interface ClCommentsJpa extends BaseJpa<Comments,Integer> {
    int deleteByCid(int cid);
    int deleteCommentsByArticle(Article article);

}
