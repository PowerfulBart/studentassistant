package com.example.zhengbotao.classassistant1.ui.post;

import com.example.zhengbotao.classassistant1.base.BasePresenter;
import com.example.zhengbotao.classassistant1.base.BasePresenterImpl;
import com.example.zhengbotao.classassistant1.base.BaseView;
import com.example.zhengbotao.classassistant1.data.bean.Post;

import java.util.List;

/**
 * Created by zhengbotao on 18-4-12.
 * Contract类用于统一管理View和Presenter接口
 * PostsContract 这里封装了本App跟帖子相关的所有View和Presenter接口
 *,包括:
 * 1.主界面的"帖子"模块
 * 2.主界面的"作业"模块
 * 3.抽屉的"我的帖子"模块
 * 4.抽屉的"我的评论"模块
 * 5.抽屉的"我的作业"模块
 */

public interface PostsContract {

    interface View extends BaseView {

        void showPosts(List<Post> posts);

        void showPost(Post post);

    }

   interface Presenter extends BasePresenter<BaseView>{

        void addNewPost();

        void loadPost();

        void loadPosts();

   }
}
