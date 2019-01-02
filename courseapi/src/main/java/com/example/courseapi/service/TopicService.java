package com.example.courseapi.service;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.courseapi.model.Topic;
import com.example.courseapi.repository.TopicRepository;

@Service
public class TopicService {   
   @Autowired // injecting beans using auto-wiring
   private TopicRepository topicRepo;
   public List<Topic> getAllTopics(){
	   List<Topic> topicList = new ArrayList<>();
	   topicRepo.findAll().forEach(topicList::add);
	   return topicList;
   }
   public Optional<Topic> getTopic(String id) {
	   return topicRepo.findById(id);
   }
public void addTopic(Topic topic) {
	topicRepo.save(topic);
}
public void updateTopic(Topic topic,String id) {
	topicRepo.save(topic); // save method works for both.
}

public void deleteTopic(String id) {
  topicRepo.deleteById(id);
}
}
