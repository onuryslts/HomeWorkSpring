package kodlama.io.language.language.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.language.language.business.abstracts.LanguageService;
import kodlama.io.language.language.dataAccess.abstracts.LanguageRepository;
import kodlama.io.language.language.entities.concretes.Language;

@Service
public class LanguageMenager implements LanguageService {

	private LanguageRepository languageRepository;
	
	@Autowired
	public LanguageMenager(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}

	@Override
	public List<Language> getAll() {
		
		return languageRepository.getAll();
	}

	@Override
	public void deleteLanguage(int id) {
		languageRepository.delete(id);
		
	}

	@Override
	public void addLanguage(Language language) throws Exception {
		if(language.getName() == "") {
			throw new Exception("Programlama dili bos gecilemez!");
		}
		for(Language l : getAll()) {
			if(l.getName() == language.getName()) {
				throw new Exception("Ayni isim tekrar edemez!");
			}
		}
		languageRepository.add(language);
	}

	@Override
	public Language updateLanguage(int id, Language language) throws Exception {
		if(language.getName() == "") {
			throw new Exception("Programlama dili bos gecilemez!");
		}
		for(Language l : getAll()) {
			if(l.getName() == language.getName()) {
				throw new Exception("Ayni isim tekrar edemez!");
			}
		}
		return languageRepository.update(id, language);
	}

	@Override
	public Language getLanguageById(int id) {
		return languageRepository.getById(id);
	}

}
