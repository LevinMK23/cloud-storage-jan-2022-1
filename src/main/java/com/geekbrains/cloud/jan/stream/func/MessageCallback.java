package com.geekbrains.cloud.jan.stream.func;

import com.geekbrains.cloud.jan.model.CloudMessage;

@FunctionalInterface
public interface MessageCallback {

    void onMessageReceived(CloudMessage message);

}
