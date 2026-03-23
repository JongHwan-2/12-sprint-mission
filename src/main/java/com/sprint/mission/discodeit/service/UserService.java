package com.sprint.mission.discodeit.service;

import com.sprint.mission.discodeit.entity.User;

import java.util.List;
import java.util.UUID;

// [] 도메인 모델 별 CRUD(생성, 읽기, 모두 읽기, 수정, 삭제) 기능을 인터페이스로 선언하세요
// [O] 인터페이스 패키지명: com.sprint.mission.discodeit.service
// [O] 인터페이스 네이밍 규칙: [도메인 모델 이름]Service

public interface UserService {
    User save(User user);
    User findById(UUID id);
    List<User> findAll();
    User update(User user);
    User delete(UUID id);
}