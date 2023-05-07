package com.example.userservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@FeignClient(name = "meetings-service", url= "http://localhost:9001")
public interface UserClient {

    @GetMapping("/meetings")
    public ArrayList<Meetings> getAllMeetings();

}
