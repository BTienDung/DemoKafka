package com.example.demo.config;


import com.example.demo.stream.GreetingsStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;
@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
}