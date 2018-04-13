package com.example.zhengbotao.classassistant1.base;

/**
 * Created by zhengbotao on 18-3-10.
 * P层实现的基类,包括View的绑定解除,View的获取等
 * Presenter中可共用的代码就是对View引用的方法了
 * 由于我们已经定义好了BaseView，所以我们希望Presenter中持有的View都是BaseView的子类，这里同样需要泛型来约束
 */

public class BasePresenterImpl<V extends BaseView> implements BasePresenter<V>{

    /**
     * 绑定的View
     */
    private V mvpView;

    /**
     * 若MvpView由Presenter的构造函数传进来，在进行异步求情的过程中，若View被销毁，
     * Presenter收到后台反馈并调用View接口处理UI逻辑时，由于Activity已经被销毁，就会引发空指针异常。
     * 想要避免这种情况的发生就需要每次调用View前都知道宿主Activity的生命状态。
     *
     * 之前是在Presenter的构造方法中得到View接口的引用，现在我们需要修改Presenter引用View接口的方式让View接口与宿主Activity共存亡：
     * 即在View的生命周期函数中随时进行View的绑定（onCreate）与销毁（onDestroy）
     *
     * 以下:
     * attachView()和detachView()是为Activity准备的，isViewAttached()作用是Presenter内部每次调用View接口中的方法是判断View 的引用是否存在
     */

    /**
     * 在View的onCreate()中调用,将View和Presenter进行绑定
     * @param mvpView 注入到Presenter中的View接口
     */
    @Override
    public void attachView(V mvpView){
        this.mvpView = mvpView;
    }

    /**
     * 在View的onDestroy()中调用,将VIew和Presenter进行解绑,以在 后台进行异步数据请求过程中 当View被意外销毁时,能够停止 对View接口的调用
     */
    @Override
    public void detachView(){
        this.mvpView = null;
    }

    /**
     * 判断 判断View引用是否存在,以便Presenter得到后台数据后,能先进行View状态判断,从而决定要不要调用View接口
     * @return View的状态
     */
    @Override
    public boolean isViewAttached(){
        return mvpView != null;
    }

    /**
     * 提供一个获取当前Presenter绑定的View的接口
     * @return 当前Presenter绑定的View的接口
     */
    @Override
    public V getView(){
        return mvpView;
    }
}
