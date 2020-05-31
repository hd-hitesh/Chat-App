package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAa33C0oQ:APA91bH2HQVMTtuZ2hv0cEdB1FVHKNbAKt-iPtK_1F3UAhzTGySpN1nTls6chOkw3-LehjoNqsQg9d_uFw9c2FfWcd_fbhuxoFBc1YkqzQ2Crgm82dh3HdMb_LCZMkI5BziwWsiVe8j6"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);

}
