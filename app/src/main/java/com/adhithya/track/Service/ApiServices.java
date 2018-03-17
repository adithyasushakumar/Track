package com.adhithya.track.Service;

import com.adhithya.track.responce.Login;
import com.adhithya.track.responce.Success;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by Hari Group Unity on 16-03-2018.
 */

public interface ApiServices {

    //LOGIN
    @FormUrlEncoded
    @POST("loginapi.php")
    Call<Login> userLogin(
            @Field("username") String username,
            @Field("password") String password,
            @Field("key") String key);

    @FormUrlEncoded
    @POST("location_details.php")
    Call<Success> sendLocation(@Field("uid") String uid,
                               @Field("lattitude") String lati,
                               @Field("longtitude") String longi);

}
