package kodlama.io.language.language.dataAccess.abstracts;

import java.util.List;

import kodlama.io.language.language.entities.concretes.Language;

public interface LanguageRepository {
	List<Language> getAll();
	void delete(int id);
	void add(Language language);
	Language update(int id, Language language);
	Language getById(int id);
}
