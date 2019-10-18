package com.example.orama.api;

import com.example.orama.model.Item;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("json/fund_detail_full.json?serializ%20er=fund_detail_full/")
    Call<List<Item>>getItems();
}
