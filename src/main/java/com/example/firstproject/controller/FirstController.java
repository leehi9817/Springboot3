package com.example.firstproject.controller;

// 컨트롤러 선언과 동시에 자동으로 임포트
import org.springframework.stereotype.Controller;
// URL 연결 요청(@GetMapping())과 동시에 자동으로 임포트
import org.springframework.web.bind.annotation.GetMapping;
// Model 클래스 패키지 자동 임포트
import org.springframework.ui.Model;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) { // Model 객체 받아오기
        // model 객체가 "혜인" 값을 "username"에 연결해 웹 브라우저로 보냄
        model.addAttribute("username", "hyein"); // "혜인" → "hyein" 수정
        return "greetings"; // greetings.mustache 파일 반환
    }
}
