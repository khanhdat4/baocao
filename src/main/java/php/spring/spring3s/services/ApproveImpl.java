
package php.spring.spring3s.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import php.spring.spring3s.model.Approve;
import php.spring.spring3s.respositories.ApproveRespository;

@Service
public class ApproveImpl implements ApproveService {

	@Autowired
	ApproveRespository approveRespository;

	@Override
	public List<Approve> findAll() {
		return (List<Approve>) approveRespository.findAll();
	}

	@Override
	public Approve save(Approve entity) {
		return approveRespository.save(entity);
	}

	@Override
	public List<Approve> saveAll(List<Approve> entities) {
		return (List<Approve>) approveRespository.saveAll(entities);
	}

	@Override
	public long count() {
		return approveRespository.count();
	}

	@Override
	public void deleteById(String id) {
		approveRespository.deleteById(id);
	}

	@Override
	public void delete(Approve entity) {
		approveRespository.delete(entity);
	}

	@Override
	public void deleteAll() {
		approveRespository.deleteAll();
	}

	@Override
	public Optional<Approve> findById(String s) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isExisted(String s) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteAllById(Iterable<? extends String> strings) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(List<Approve> entities) {
		// TODO Auto-generated method stub
		
	}

}
