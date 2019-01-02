package com.example.courseapi.repository;
import com.example.courseapi.model.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface TopicRepository extends CrudRepository<Topic, String> {
    // Define only specific query methods here
}
