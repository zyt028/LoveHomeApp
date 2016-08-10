package com.lovehome.publish.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/8/9.
 */
public class Publishdata implements Serializable {
    private String parent_cate_id;
    private String parent_cate_img_url;
    private String parent_cate_name;

    public Publishdata() {
    }

    public Publishdata(String parent_cate_img_url, String parent_cate_name, String parent_cate_id) {
        this.parent_cate_img_url = parent_cate_img_url;
        this.parent_cate_name = parent_cate_name;
        this.parent_cate_id = parent_cate_id;
    }

    public String getParent_cate_id() {
        return parent_cate_id;
    }

    public void setParent_cate_id(String parent_cate_id) {
        this.parent_cate_id = parent_cate_id;
    }

    public String getParent_cate_img_url() {
        return parent_cate_img_url;
    }

    public void setParent_cate_img_url(String parent_cate_img_url) {
        this.parent_cate_img_url = parent_cate_img_url;
    }

    public String getParent_cate_name() {
        return parent_cate_name;
    }

    public void setParent_cate_name(String parent_cate_name) {
        this.parent_cate_name = parent_cate_name;
    }

    @Override
    public String toString() {
        return "Publishdata{" +
                "parent_cate_id='" + parent_cate_id + '\'' +
                ", parent_cate_img_url='" + parent_cate_img_url + '\'' +
                ", parent_cate_name='" + parent_cate_name + '\'' +
                '}';
    }
}
