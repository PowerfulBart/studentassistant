package com.example.zhengbotao.classassistant1.data.bean;

/**
 * Created by zhengbotao on 18-4-11.
 * Bmob 数据类型说明类,仅说明用
 */

public class AboutBmob {

    /**
     * 1.Bmob存储的数据是建立在BmobObject基础上的，所以任何要保存的数据对象必须继承自BmobObject类
     * BmobObject类本身包含objectId、createdAt、updatedAt、ACL四个默认的属性，
     * objectId是数据的唯一标示，相当于数据库中表的主键，
     * createdAt是数据的创建时间，
     * updatedAt是数据的最后修改时间，
     * ACL是数据的操作权限
     *
     *
     * 2.使用Integer、Boolean，而不是int、boolean，也就是选择包装类，而不是使用基本数据类型
     *
     *
     * 3.BmobSDK中提供了BmobUser、BmobInstallation、BmobRole三个特殊的BmobObject对象来完成不同的功能
     * 3.1 BmobUser对象主要是针对应用中的用户功能而提供的，它对应着web端的User表，
     *     使用BmobUser对象可以很方便的在应用中实现用户的注册、登录、邮箱验证等功能
     *
     *     BmobUser除了从BmobObject继承的属性外，还有几个特定的属性：
     *     3.1.1 username: 用户的用户名（必需）。
     *     3.1.2 password: 用户的密码（必需）。
     *     3.1.3 email: 用户的电子邮件地址（可选）。
     *     3.1.4 emailVerified:邮箱认证状态（可选）。
     *     3.1.5 mobilePhoneNumber：手机号码（可选）。
     *     3.1.6 mobilePhoneNumberVerified：手机号码的认证状态（可选）。
     *
     * 3.2 BmobInstallation对象主要用于应用的安装设备管理中，它对应着web端的Installation表，
     *    任何安装了你应用的设备都会在此表中产生一条数据标示该设备
     *
     * 3.3 BmobRole对象主要用于角色管理，对应用于Web端的Role表
     *
     *
     * 4.目前为止，Bmob支持的数据类型：String、Integer、Float、Short、Byte、Double、Character、Boolean、Object、Array。
     *   同时也支持 BmobObject、BmobDate、BmobGeoPoint、BmobFile特有的数据类型。
     *
     */
}
