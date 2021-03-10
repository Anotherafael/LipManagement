package lip.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DefaultEntityManager {

	private static EntityManagerFactory emf = null;

	private DefaultEntityManager() {
		// nao permitir a instancia
	}

	public static EntityManager getEntityManager() {
		if (emf == null)
			emf = Persistence.createEntityManagerFactory("lip");
		return emf.createEntityManager();
	}
}
