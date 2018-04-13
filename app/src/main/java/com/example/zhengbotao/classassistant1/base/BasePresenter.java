package com.example.zhengbotao.classassistant1.base;

/**
 * Created by zhengbotao on 18-4-12.
 */

public interface BasePresenter<V extends BaseView> {

    void attachView(V mvpView);

    void detachView();

    boolean isViewAttached();

    V getView();
}
