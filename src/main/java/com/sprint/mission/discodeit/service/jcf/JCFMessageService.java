package com.sprint.mission.discodeit.service.jcf;

import com.sprint.mission.discodeit.entity.Message;
import com.sprint.mission.discodeit.service.ChannelService;
import com.sprint.mission.discodeit.service.MessageService;
import com.sprint.mission.discodeit.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class JCFMessageService implements MessageService {
    private final List<Message> data;
    private UserService userService;
    private ChannelService channelService;

    public JCFMessageService(UserService userService, ChannelService channelService) {
        this.data = new ArrayList<>();
        this.userService = userService;
        this.channelService = channelService;
    }

    @Override
    public Message save(Message message) {
        UserService userId = this.userService;
        ChannelService channelId = this.channelService;
        if (userId.findById(message.getUserId()) != null && channelId.findById(message.getChannelId()) != null) {
            data.add(message);
            return message;
        }
        return null;
    }

    @Override
    public Message findById(UUID id) {
        for (Message message : data) {
            if (message.getId().equals(id)) {
                return message;
            }
        }

        return null;
    }

    @Override
    public List<Message> findAll() {
        return data;
    }

    @Override
    public Message update(Message message) {
        Message findMessage = findById(message.getId());
        if (findMessage != null) {
            findMessage.update(findMessage.getContent());
            return findMessage;
        }

        return null;
    }

    @Override
    public Message delete(UUID id) {
        Message findMessage = findById(id);
        if (findMessage != null) {
            data.remove(findMessage);
            return findMessage;
        }
        return null;
    }
}
