package com.hirebigdata.threadspider.pojo;

import java.util.ArrayList;

/**
 * Created by Administrator on 2015/1/14.
 */
public class ZhihuUserDetil {
    String user_data_id;// class:zm-profile-header-op-btns clearfix tag:button  data-id 唯一标识
//    String user__xsrf_value;//请求中的xsrf ????
    String name; // name/about   class:title-section ellipsis
    String url_name;//连接上的后部分
    String bio = "";// name/about   class:bio
    ArrayList<String> locations = new ArrayList<String>();// name/about 居住信息  class:zm-profile-icon zm-profile-icon-location
    String business = ""; //class:business item
    String business_topic_url = "";//class:business item
    String gender;//class:item gender
    ArrayList<String> employments = new ArrayList<String>();  // name/about 职业经历  class:zm-profile-icon zm-profile-icon-company
    ArrayList<String> educations = new ArrayList<>();   // name/about 教育经历  class:zm-profile-icon zm-profile-icon-edu
    String description = "";//class:fold-item
    String vote_count = "0";//class:zm-profile-module-desc
    String thank_count = "0";//class:zm-profile-module-desc
    String fav_count = "0";//class:zm-profile-module-desc
    String share_count = "0";//class:zm-profile-module-desc
    String weibo_url = "";//class:zm-profile-header-user-weibo
//    String followee_count = "0";//  href:/people/name/followees
//    String follower_count = "0";//  href:/people/name/followers
//    String questions_count = "0";//  href:/people/name/asks
//    String answers_count = "0";// href:/people/name/answers
//    String posts_count = "0";// href:/people/name/posts
//    String collections_count = "0";// href:/people/name/collections
//    String logs_count = "0";// href:/people/name/logs
//    String personal_page_view_count = "0";//class:zm-profile-side-section
//    String follow_columns_count = "0";//class:zm-profile-side-section
//    String follow_topics_count = "0";//class:zm-profile-side-section


    public String getUser_data_id() {
        return user_data_id;
    }

    public void setUser_data_id(String user_data_id) {
        this.user_data_id = user_data_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl_name() {
        return url_name;
    }

    public void setUrl_name(String url_name) {
        this.url_name = url_name;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public ArrayList<String> getLocations() {
        return locations;
    }

    public void setLocations(ArrayList<String> locations) {
        this.locations = locations;
    }

    public String getBusiness() {
        return business;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public String getBusiness_topic_url() {
        return business_topic_url;
    }

    public void setBusiness_topic_url(String business_topic_url) {
        this.business_topic_url = business_topic_url;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ArrayList<String> getEmployments() {
        return employments;
    }

    public void setEmployments(ArrayList<String> employments) {
        this.employments = employments;
    }

    public ArrayList<String> getEducations() {
        return educations;
    }

    public void setEducations(ArrayList<String> educations) {
        this.educations = educations;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVote_count() {
        return vote_count;
    }

    public void setVote_count(String vote_count) {
        this.vote_count = vote_count;
    }

    public String getThank_count() {
        return thank_count;
    }

    public void setThank_count(String thank_count) {
        this.thank_count = thank_count;
    }

    public String getFav_count() {
        return fav_count;
    }

    public void setFav_count(String fav_count) {
        this.fav_count = fav_count;
    }

    public String getShare_count() {
        return share_count;
    }

    public void setShare_count(String share_count) {
        this.share_count = share_count;
    }

    public String getWeibo_url() {
        return weibo_url;
    }

    public void setWeibo_url(String weibo_url) {
        this.weibo_url = weibo_url;
    }
}
