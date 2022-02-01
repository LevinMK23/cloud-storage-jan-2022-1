package com.geekbrains.cloud.jan;

import java.util.HashMap;
import java.util.Map;

import com.geekbrains.cloud.jan.model.CloudMessage;
import com.geekbrains.cloud.jan.model.CommandType;

public class ProcessorRegistry {

    private Map<CommandType, MessageProcessor> map;

    public ProcessorRegistry() {
        map = new HashMap<>();
        map.put(CommandType.FILE, msg -> {

        });
    }

    public void process(CloudMessage msg) {
        map.get(msg.getType()).processMessage(msg);
    }

}
