package com.example.courseapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.courseapi.service.TopicService;
import com.example.courseapi.model.Topic;
@RestController
public class TopicController {
    @Autowired
	private TopicService topicService;
	@RequestMapping("/topics")
	public List<Topic> getAllTopics(){
	   return topicService.getAllTopics();
	}
	@RequestMapping("/topics/{id}")
	public Optional<Topic> getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	@RequestMapping(value="/topics",method = RequestMethod.POST)
	public void newTopic(@RequestBody Topic topic) {// JSON object is sent by user which is converted as topic object by spring
		topicService.addTopic(topic);
	}
	@RequestMapping(value="/topics/{id}",method=RequestMethod.PUT)
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id) {
		topicService.updateTopic(topic,id);
	}
	@DeleteMapping(value="/topics/{id}")// we can use GetMapping,PostMapping etc instead of RequestMapping
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}
}
