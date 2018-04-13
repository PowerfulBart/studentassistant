package com.example.zhengbotao.classassistant1.base;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by zhengbotao on 18-3-10.
 * BaseActivity主要是负责实现 BaseView 中通用的UI逻辑方法，
 * 这样这些通用的方法就不用每个Activity都要去实现一遍了。
 */

public abstract class BaseActivity<T extends BasePresenterImpl> extends AppCompatActivity implements BaseView {

    private ProgressDialog dialog;
    private Unbinder mUnbinder;
    private T mPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        // 初始化ButterKnife
        mUnbinder = ButterKnife.bind(this);
        // 初始化Presenter
        mPresenter = initPresenter();
        // 将Presenter 与 View绑定,
        if (mPresenter != null){
            mPresenter.attachView(this);
        }
        // 初始化View
        initView();

        // 设置监听
        setListener();

        dialog = new ProgressDialog(this);
        dialog.setCancelable(false);
    }

    // 设置监听器
    protected abstract void setListener();
    // 初始化View
    protected abstract void initView();
    // 获取布局Id
    protected abstract int getLayoutId();
    // 初始化Presenter
    public abstract T initPresenter();

    @Override
    public void showLoading() {
        if (!dialog.isShowing()){
            dialog.show();
        }
    }

    @Override
    public void hideLoading() {
        if (dialog.isShowing()){
            dialog.dismiss();
        }
    }

    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public Context getContext() {
        return BaseActivity.this;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // 防止内存泄露
        if (mUnbinder != null){
            mUnbinder.unbind();
        }
        if (mPresenter != null){
            mPresenter.detachView();
        }
    }
}
