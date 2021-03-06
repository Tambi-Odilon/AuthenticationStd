package ma.berexia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.berexia.entities.Forms;

public interface FormsRepository extends JpaRepository<Forms, Integer> {
	public Forms findByType(String type);

	public Forms findByIdForms(int idForms);
}
