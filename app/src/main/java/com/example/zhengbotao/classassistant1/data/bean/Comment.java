package com.example.zhengbotao.classassistant1.data.bean;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobDate;

/**
 * Created by zhengbotao on 18-4-11.
 *
 * 评论实体类,包含 评论所属贴,评论所属用户,评论内容,评论时间 字段
 */

public class Comment extends BmobObject{

    // 该评论所属帖子,一对一关系,用Pointer
    private Post commentBelongToPost;

    // 该评论所属作者,一对一关系,用Pointer
    private Author commentBelongToAuthor;

    // 评论内容
    private String commentContent;

    // 评论时间
    private BmobDate commentTime;

    public Post getCommentBelongToPost() {
        return commentBelongToPost;
    }

    public void setCommentBelongToPost(Post commentBelongToPost) {
        this.commentBelongToPost = commentBelongToPost;
    }

    public Author getCommentBelongToAuthor() {
        return commentBelongToAuthor;
    }

    public void setCommentBelongToAuthor(Author commentBelongToAuthor) {
        this.commentBelongToAuthor = commentBelongToAuthor;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }

    public BmobDate getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(BmobDate commentTime) {
        this.commentTime = commentTime;
    }
}
