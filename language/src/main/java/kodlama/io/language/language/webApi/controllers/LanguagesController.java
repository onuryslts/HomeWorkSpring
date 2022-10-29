package kodlama.io.language.language.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.language.language.business.abstracts.LanguageService;
import kodlama.io.language.language.entities.concretes.Language;

@RestController
@RequestMapping("/api/languages")
public class LanguagesController {
	private LanguageService languageService;

	@Autowired
	public LanguagesController(LanguageService languageService) {
		this.languageService = languageService;
	}
	@GetMapping("/getall")
	public List<Language> getAll(){
		return languageService.getAll();
	}
	@PostMapping("/add")
	public void add(@RequestBody Language language) throws Exception{
		languageService.addLanguage(language);
	}
	@PostMapping("/update")
	public void update(@RequestBody Language language) throws Exception{
		languageService.updateLanguage(language.getId(),language);
	}
	@DeleteMapping("/delete")
	public void delete(@RequestBody Language language) {
		languageService.deleteLanguage(language.getId());
	}
	
	@GetMapping("/get/{id}")
	public Language getId(@PathVariable int id) {
		return languageService.getLanguageById(id);
	}
	
}
