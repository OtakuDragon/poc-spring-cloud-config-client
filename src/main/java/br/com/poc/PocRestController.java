package br.com.poc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PocRestController {

	@Value("${propriedade.ambiente}")
	private String ambiente;
	
	@RequestMapping(method=RequestMethod.GET, value = "/ambiente")
    public String greeting() {
        return ambiente;
    }
}
