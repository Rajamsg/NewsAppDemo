package com.example.newsapp.webServices;

import com.example.newsapp.modalClass.AllNewsResponse;

import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
public interface APICall {

   /* //Delete Single Item From Wishlist
    @FormUrlEncoded
    @POST("manageWishlist")
    Call<ServerResponseDeleteAllWishlist> deleteSingleItemFromWishlist(@Field("userid") int userid, @Field("storeid") int storeid);
*/
    //GEt the data for catering seach query
    @GET("newslist/0.json")
    Call<AllNewsResponse> getAllNews();



}
