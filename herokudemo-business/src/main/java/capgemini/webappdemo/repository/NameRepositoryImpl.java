package capgemini.webappdemo.repository;


import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import capgemini.webappdemo.domain.Name;


@Repository
@Transactional
public class NameRepositoryImpl extends EntityRepositoryImpl<Name> implements NameRepository {
	
	public NameRepositoryImpl() {
		super(Name.class);
	}
}
