package com.example.zhengbotao.classassistant1.data;

import com.example.zhengbotao.classassistant1.data.bean.Author;
import com.example.zhengbotao.classassistant1.data.bean.Post;

/**
 * Created by zhengbotao on 18-4-11.
 */

public class DataRepository implements DataSource {

    @Override
    public void login(String account, String password) {

    }

    @Override
    public void register(String account, String password) {

    }

    @Override
    public void loadAllPosts(LoadPostsCallback callback) {

    }

    @Override
    public void loadMyHomework(Author currentUser, LoadPostsCallback callback) {

    }

    @Override
    public void loadPost(String objectId, LoadPostCallback callback) {

    }

    @Override
    public void addPost(Author author, String title, String content, String postType, AddPostCallback callback) {

    }

    @Override
    public void addComment(Post post, Author author, String content) {

    }

    @Override
    public void loadMyCourse(Author author) {

    }

    @Override
    public void loadAllMyPosts(LoadPostsCallback callback) {

    }

    @Override
    public void loadMyCommentPost(LoadPostsCallback callback) {

    }
}
