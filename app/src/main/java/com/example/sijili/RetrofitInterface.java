package com.example.sijili;

import com.example.sijili.requests.OTPRequest;
import com.example.sijili.requests.SignupRequest;

import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface RetrofitInterface {

    @POST("/login")
    Call<LoginResponse> executeLogin(@Body LoginRequest loginRequest);

    @POST("/register")
    Call<Void> executeSignup(@Body SignupRequest signupRequest); // New endpoint for sign-up

    @POST("/verify")
    Call<Void> verifyOtp(@Body OTPRequest otpRequest);
}
