package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;

import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Ad> all();

    // insert a new ad and return the new ad's id
    Long insert(Ad ad);

    // delete an add
    void delete(Ad ad);

    // find an add using only the id of the ad
    Ad findById(long id);

    // allows logged-in user to edit their ads
    void editAd(String title, String description, String category, Ad ad);
}
