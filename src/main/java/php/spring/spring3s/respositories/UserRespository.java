package php.spring.spring3s.respositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import php.spring.spring3s.model.User;

@Repository
public interface UserRespository extends CrudRepository<User, String> {
}
