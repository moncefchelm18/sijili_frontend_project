package com.example.sijili;

import com.example.sijili.requests.CommerceRequest;
import com.example.sijili.requests.OTPRequest;
import com.example.sijili.requests.SignupRequest;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

import java.util.List;

public interface RetrofitInterface {

    @POST("/login")
    Call<LoginResponse> executeLogin(@Body LoginRequest loginRequest);

    @POST("/register")
    Call<Void> executeSignup(@Body SignupRequest signupRequest);

    @POST("/verify")
    Call<Void> verifyOtp(@Body OTPRequest otpRequest);

    @GET("/server/posts") // New endpoint to get commerce registration requests
    Call<List<CommerceRequest>> getCommerceRequests();

    @GET("/server/posts/{id}") // New endpoint to get a specific commerce registration request by ID
    Call<CommerceRequest> getCommerceRequestById(@Path("id") String id);


}
