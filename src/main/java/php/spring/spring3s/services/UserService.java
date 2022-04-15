package php.spring.spring3s.services;

import php.spring.spring3s.model.User;

import java.util.List;
import java.util.Optional;





public interface UserService {
	List<User> findAll();

	long count();

	Optional<User> findById(String s);

	boolean isExisted(String s);

	User save(User entity);

	List<User> saveAll(List<User> entities);

	void deleteById(String userid);

	void delete(User entity);

	void deleteAllById(Iterable<? extends String> strings);

	void deleteAll(List<User> entities);

	void deleteAll();

	boolean isLogin(String username, String password);
}
