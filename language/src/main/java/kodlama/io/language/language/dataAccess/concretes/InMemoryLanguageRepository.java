package kodlama.io.language.language.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.language.language.dataAccess.abstracts.LanguageRepository;
import kodlama.io.language.language.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository {

	List<Language> languages;
	
	
	public InMemoryLanguageRepository() {
		languages = new ArrayList<Language>();
		languages.add(new Language(1, "HTML","Kullanısli"));
		languages.add(new Language(2, "CSS","Kullanısli"));
		languages.add(new Language(3, "C#","Kullanısli"));
		languages.add(new Language(4, "JAVA","Kullanısli"));
		languages.add(new Language(5, "PYTHON","Kullanısli"));
	}

	@Override
	public List<Language> getAll() {
		
		return languages;
	}

	@Override
	public void delete(int id) {
		languages.remove(id);
		
	}

	@Override
	public void add(Language language) {
		languages.add(language);
		
	}

	@Override
	public Language update(int id, Language language) {
		languages.set(id, language);
		return language;
	}

	@Override
	public Language getById(int id) {
		languages.get(id);
		return null;
	}

}
