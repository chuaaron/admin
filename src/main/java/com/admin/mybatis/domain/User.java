package com.admin.mybatis.domain;

import javax.persistence.Column;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * <p>Description: </p>
 * <p>Copyright(c) 2017-2019 lyzb.com Inc. All Rights Reserved.</p>
 * <p>Other: </p>
 * <p>Date：2018-04-19 21:17 </p>
 * <p>Modification Order 1: </p>
 * <pre>
 *  Modified Date：
 *  Version：
 *  Modifier：
 *  Modification Content：
 * </pre>
 * <p>Modification Order 2：…</p>
 *
 * @author <a href="wubin3347@gmail.com">wubin</a>
 * @version 1.0.0
 */
@Table(name = "rcwl_user")
public class User implements Serializable {

    @Column(name = "id")
    private Long id;
    /**
     * 用户昵称
     */
    @Column(name = "user_nick_name")
    private String userNickName;
    /**
     * 密码
     */
    @Column(name = "user_password")
    private String userPassword;
    /**
     * 头像
     */
    @Column(name = "user_head_img_url")
    private String userHeadImgUrl;
    /**
     * openId
     */
    @Column(name = "user_openid")
    private String userOpenid;
    /**
     * 电话
     */
    @Column(name = "user_phone")
    private String userPhone;
    /**
     * 性别
     */
    @Column(name = "user_sex")
    private Integer userSex;
    /**
     * 省
     */
    @Column(name = "province")
    private String province;
    /**
     * 城市
     */
    @Column(name = "city")
    private String city;
    /**
     * 国家
     */
    @Column(name = "country")
    private String country;
    @Column(name = "gmt_create")
    private Date gmtCreate;
    @Column(name = "gmt_modifyed")
    private Date gmtModifyed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserHeadImgUrl() {
        return userHeadImgUrl;
    }

    public void setUserHeadImgUrl(String userHeadImgUrl) {
        this.userHeadImgUrl = userHeadImgUrl;
    }

    public String getUserOpenid() {
        return userOpenid;
    }

    public void setUserOpenid(String userOpenid) {
        this.userOpenid = userOpenid;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModifyed() {
        return gmtModifyed;
    }

    public void setGmtModifyed(Date gmtModifyed) {
        this.gmtModifyed = gmtModifyed;
    }
}
