package kodlama.io.language.language.business.abstracts;

import java.util.List;

import kodlama.io.language.language.entities.concretes.Language;

public interface LanguageService {
	List<Language> getAll();
	void deleteLanguage(int id);
	void addLanguage(Language language) throws Exception;
	Language updateLanguage(int id, Language language) throws Exception;
	Language getLanguageById(int id);
}
