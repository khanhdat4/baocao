package php.spring.spring3s.respositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import php.spring.spring3s.model.Approve;


@Repository
public interface ApproveRespository extends CrudRepository<Approve, String> {

}
