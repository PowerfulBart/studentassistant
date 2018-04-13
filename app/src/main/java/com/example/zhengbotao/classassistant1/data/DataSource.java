package com.example.zhengbotao.classassistant1.data;

import com.example.zhengbotao.classassistant1.data.bean.Author;
import com.example.zhengbotao.classassistant1.data.bean.Post;

import java.util.List;

/**
 * Created by zhengbotao on 18-4-11.
 * 定义了数据库相关操作的所有接口,分别由 LocalDataSource 和 RemoteDataSource 具体实现,并由 DataRepository 统一管理
 */

public interface DataSource {

    /**
     * 加载多帖子时的回调接口
     */
    interface LoadPostsCallback {

        // 加载成功
        void onPostsLoaded(List<Post> posts);

        // 加载失败
        void onPostsNotAvailable();
    }

    /**
     * 加载单帖子时的回调接口
     */
    interface LoadPostCallback{

        // 加载成功
        void onPostLoaded(Post post);

        // 加载失败
        void onPostNotAvailable();
    }

    /**
     * 发帖回调接口
     */
    interface AddPostCallback{

        // 发表帖子添加成功
        void onAddPostSuccess();

        // 发帖失败
        void onAddPostFailure();
    }

    /**
     * 登陆模块
     * @param account  账号
     * @param password 密码
     */
    void login(String account,String password);

    /**
     * 注册模块
     * @param account  账号
     * @param password 密码
     */
    void register(String account,String password);

    /**
     * 主界面 帖子加载模块
     * @param callback 加载结果
     */
    void loadAllPosts(LoadPostsCallback callback);

    /**
     * 主界面 作业加载 模块 以及 抽屉之 我的作业 模块
     * @param currentUser 当前用户(学生/老师)
     * @param callback    加载结果
     */
    void loadMyHomework(Author currentUser,LoadPostsCallback callback);

    /**
     * 加载 贴详情 模块,点击某一贴之后,加载贴详情
     * @param objectId 点击的贴的id
     * @param callback 点击某一贴后的回调,返回该贴
     */
    void loadPost(String objectId,LoadPostCallback callback);

    /**
     * 发帖模块,用于主界面之 帖列表展示 模块,作业列表展示 模块,抽屉之我的帖子 模块,抽屉之我的评论 模块
     * @param author   贴作者
     * @param title    贴标题
     * @param content  贴内容
     * @param postType 贴类型
     * @param callback 发帖结果:成功/失败
     */
    void addPost(Author author,String title,String content,String postType,AddPostCallback callback);

    /**
     * 贴详情界面之 评论模块
     * @param post    评论所属帖子
     * @param author  评论者
     * @param content 评论内容
     */
    void addComment(Post post,Author author,String content);

    /**
     * 抽屉之 我的课程 模块,根据用户找到其课程
     * @param author 用户
     */
    void loadMyCourse(Author author);

    /**
     * 抽屉之 我的帖子 模块,根据用户找到其所有帖子进行展示
     * @param callback 帖列表回调
     */
    void loadAllMyPosts(LoadPostsCallback callback);

    /**
     * 抽屉之我的评论 模块,根据用户找到其评论过的所有帖子进行展示
     * @param callback 贴列表回调
     */
    void loadMyCommentPost(LoadPostsCallback callback);

}
