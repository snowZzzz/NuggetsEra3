package com.example.nglibrary.bean;

import java.io.Serializable;

/**
 * Created by zhangzz on 2018/8/30
 */
public class LoginBean implements Serializable {
    /**
     * id : 39
     * mobilePhone : 18813918090
     * headPortrait : d:/file/20180827_161939_QuYC.jpg
     * nickname : 111111
     * invitationCode : 111111
     * password : NRuHccaXgx0bCQ+LJjImPQ==
     * createDate : 2018-08-20 13:52:01.0
     * updateDate : 2018-08-27 16:19:39.0
     * name : null
     * sex : null
     * idCard : null
     * passportPhoto : null
     * frontPhoto : null
     * negativePhoto : null
     * area : null
     * status : null
     * token : eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiIzOSIsImlhdCI6MTUzNTYwOTc3Niwic3ViIjoieXVueWxKSlNEIiwiaXNzIjoiMTg4MTM5MTgwOTAiLCJleHAiOjE1MzU5Njk3NzZ9.KTPfGC1h6xaqRFxVLONIPVEttP_hfKd4Gz7QeRLmt5g
     */

    private int id;
    private String mobilePhone;
    private String headPortrait;
    private String nickname;
    private String invitationCode;
    private String password;
    private String createDate;
    private String updateDate;
    private Object name;
    private Object sex;
    private Object idCard;
    private Object passportPhoto;
    private Object frontPhoto;
    private Object negativePhoto;
    private Object area;
    private Object status;
    private String token;

    public int getId() {
        return id;
    }

    public void setId(int idX) {
        this.id = idX;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getHeadPortrait() {
        return headPortrait;
    }

    public void setHeadPortrait(String headPortrait) {
        this.headPortrait = headPortrait;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public Object getName() {
        return name;
    }

    public void setName(Object name) {
        this.name = name;
    }

    public Object getSex() {
        return sex;
    }

    public void setSex(Object sex) {
        this.sex = sex;
    }

    public Object getIdCard() {
        return idCard;
    }

    public void setIdCard(Object idCard) {
        this.idCard = idCard;
    }

    public Object getPassportPhoto() {
        return passportPhoto;
    }

    public void setPassportPhoto(Object passportPhoto) {
        this.passportPhoto = passportPhoto;
    }

    public Object getFrontPhoto() {
        return frontPhoto;
    }

    public void setFrontPhoto(Object frontPhoto) {
        this.frontPhoto = frontPhoto;
    }

    public Object getNegativePhoto() {
        return negativePhoto;
    }

    public void setNegativePhoto(Object negativePhoto) {
        this.negativePhoto = negativePhoto;
    }

    public Object getArea() {
        return area;
    }

    public void setArea(Object area) {
        this.area = area;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
