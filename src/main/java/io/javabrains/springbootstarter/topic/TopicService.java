package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring","a","d"),
			new Topic("spring1","b","e"),
			new Topic("spring2","c","f"));
	
	public List<Topic> getAllTopics()
{
		return topics;
		}
}
