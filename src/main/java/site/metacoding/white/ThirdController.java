package site.metacoding.white;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import site.metacoding.white.domain.Third;

//고급 데이터 받기(json, x-www 뭐시기, text)

@RestController
public class ThirdController {

	
	@PostMapping("/third")
	public String postData(Third third) {//request DTO(요청받은값만 표시한다)
		return "id:" +third.getId()+", title: "+third.getTitle()+", content: "+third.getContent();
	}
	
	//UPDATE third SET title =?, content = ? WHERE id = ?
	@PutMapping("/third/{id}")//수정
	public String putData(@PathVariable Integer id, Third third) {
		return third.toString();
	}
	
	@PutMapping("/third/{id}/json")//수정
	public String putJsonData(@PathVariable Integer id, @RequestBody Third third) {
		return third.toString();
	}
}
