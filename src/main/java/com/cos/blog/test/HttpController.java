package com.cos.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//사용자가 요청 -> 응답(HTML 파일)
//@Controller

//사용자가 요청 -> 응답(Data)
//@RestController
@RestController
public class HttpController {
	private static final String TAG = "HttpControllerTest : ";
	
	@GetMapping("/http/lombok")
	public String lombokTest() {
		Member m = Member.builder().userName("Sar").password("1234").email("nate.com").build();
		System.out.println(TAG+"Getter"+m.getUserName());
		m.setUserName("cos");
		System.out.println(TAG+"Getter"+m.getUserName());
		return "lombok test 완료";
	}
	// 인터넷 브라우저 요청은 get요청밖에 할 수 없다.
	
	// http://localhost:8080/http/get (select)
	@GetMapping("/http/get")
	public String getTest(Member m) {
		
		return "get 요청 : "+ m.getId()+", "+m.getUserName()+", "+m.getPassword()+", "+m.getEmail();
	}
	
	// http://localhost:8080/http/post (insert)
	@PostMapping("/http/post")
	public String postTest(@RequestBody Member m) {
		return "post 요청 : "+ m.getId()+", "+m.getUserName()+", "+m.getPassword()+", "+m.getEmail();
	}
	
	// http://localhost:8080/http/put (update)
	@PutMapping("/http/put")
	public String putTest(@RequestBody Member m) {
		return "put 요청 : "+ m.getId()+", "+m.getUserName()+", "+m.getPassword()+", "+m.getEmail();
	}
	
	// http://localhost:8080/http/delete (delete)
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete 요청";
	}
}
