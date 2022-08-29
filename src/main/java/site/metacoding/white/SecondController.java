package site.metacoding.white;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//데이터 받기
//GET ->http body가 없음.->QueryString,PathVariable(PK) -> Form(GET)->브라우저(주소뒤 ?붙이기)
//POST,PUT -> http body 담아준다. ->Form(POST) -> JS
//DELETE -> http body가 없음. ->QueryString,PathVariable(PK)

@RestController
public class SecondController {
	
	@GetMapping("/second/{id}")//PK(id)가 1인것
	public String getData(@PathVariable Integer id) {
		return "id:"+id;
	}
	
	//QueryString = x-www-form-urlencoded 타입이다
	@GetMapping("/second")//쿼리스트링
	public String getData2(String title,String content) {
		return "title: "+title +", content: "+content;
	}
	
	//BR(버퍼드리드) -> title=제목&content=내용, content-type
	@PostMapping("/second")//post는 body에 담아보낸다(주소x)
	public String postData(String title,String content) {//스프링 파싱 기본전략 : x-www-form머시기
		return "title: "+title +", content: "+content;
	}
	
	@PutMapping("/second")
	public String putData(String title,String content) {
		return "title: "+title +", content: "+content;
	}
	
	@DeleteMapping("/second/{id}")
	public String deleteData(@PathVariable Integer id) {
		return id+" delete ok";
	}
	
	@DeleteMapping("/second/")
	public String deleteData2(String id) {
		return id+" delete ok";
	}
}
