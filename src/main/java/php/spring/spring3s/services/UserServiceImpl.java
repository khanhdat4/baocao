
package php.spring.spring3s.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import php.spring.spring3s.model.User;
import php.spring.spring3s.respositories.UserRespository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRespository userRespository;

	@Override
	public List<User> findAll() {
		return (List<User>) userRespository.findAll();
	}

	@Override
	public long count() {
		return userRespository.count();
	}

	@Override
	public Optional<User> findById(String s) {
		return userRespository.findById(s);
	}

	@Override
	public boolean isExisted(String s) {
		return userRespository.existsById(s);
	}

	@Override
	public User save(User entity) {
		return userRespository.save(entity);
	}

	@Override
	public List<User> saveAll(List<User> entities) {
		return (List<User>) userRespository.saveAll(entities);
	}

	@Override
	public void deleteById(String userid) {
		userRespository.deleteById(userid);
	}

	@Override
	public void delete(User entity) {
		userRespository.delete(entity);
	}

	@Override
	public void deleteAllById(Iterable<? extends String> strings) {
		userRespository.deleteAllById(strings);
	}

	@Override
	public void deleteAll(List<User> entities) {
		userRespository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		userRespository.deleteAll();
	}

	@Override
	public boolean isLogin(String username, String password) {
		Optional<User> optionalUser = findById(username);
		return optionalUser.isPresent() && optionalUser.get().getPassword().equals(password);
	}
}
