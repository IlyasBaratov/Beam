package com.beam.project.beam.repository;

import java.time.LocalDateTime;
import java.util.List;

import com.beam.project.beam.model.Message;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByUsername(String username);
    List<Message> findByTimestampBetween(LocalDateTime start, LocalDateTime end);
    List<Message> findByUsernameAndTimestampBetween(String username, LocalDateTime start, LocalDateTime end);
}
