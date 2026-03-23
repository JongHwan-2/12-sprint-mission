package com.sprint.mission.discodeit.service.jcf;

import com.sprint.mission.discodeit.entity.Channel;
import com.sprint.mission.discodeit.service.ChannelService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class JCFChannelService implements ChannelService {
    private final List<Channel> data;

    public JCFChannelService(){
        data = new ArrayList<>();
    }

    @Override
    public Channel save(Channel channel) {
        data.add(channel);
        return channel;
    }

    @Override
    public Channel findById(UUID id) {
        for (Channel channel : data) {
            if (channel.getId().equals(id)) {
                return channel;
            }
        }

        return null;
    }

    @Override
    public List<Channel> findAll() {
        return data;
    }

    @Override
    public Channel update(Channel channel) {
        Channel findChannel = findById(channel.getId());
        if(findChannel != null){
            findChannel.update(
                    channel.getName(),
                    channel.getDescription()
            );
            return findChannel;
        }

        return null;
    }

    @Override
    public Channel delete(UUID id) {
        Channel findChannel = findById(id);
        if(findChannel != null){
            data.remove(findChannel);
            return findChannel;
        }

        return null;
    }


}
