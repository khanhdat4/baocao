package php.spring.spring3s.services;

import java.util.List;
import java.util.Optional;

import php.spring.spring3s.model.Approve;



public interface ApproveService {

	List<Approve> findAll();

	long count();

	Optional<Approve> findById(String s);

	boolean isExisted(String s);

	Approve save(Approve entity);

	List<Approve> saveAll(List<Approve> entities);

	void deleteById(String userid);

	void delete(Approve entity);

	void deleteAllById(Iterable<? extends String> strings);

	void deleteAll(List<Approve> entities);

	void deleteAll();

	

	
}
