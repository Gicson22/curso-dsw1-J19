package pe.edu.idat.dsw1soapJ19;

import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import io.spring.guides.gs_producing_web_service.Dia;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class DiasRepository {

	private static final Map<String, Dia> dias = new HashMap<>();

	@PostConstruct
	public void initData() {
		Dia lunes = new Dia();
		lunes.setName("Lunes");
		dias.put(lunes.getName(), lunes);

		Dia martes = new Dia();
		martes.setName("Martes");
		dias.put(martes.getName(), martes);

		Dia miercoles = new Dia();
		miercoles.setName("Miercoles");
		dias.put(miercoles.getName(), miercoles);

		Dia jueves = new Dia();
		jueves.setName("Jueves");
		dias.put(jueves.getName(), jueves);

		Dia viernes = new Dia();
		viernes.setName("Viernes");
		dias.put(viernes.getName(), viernes);

		Dia sabado = new Dia();
		sabado.setName("Sabado");
		dias.put(sabado.getName(), sabado);

		Dia domingo = new Dia();
		domingo.setName("Domingo");
		dias.put(domingo.getName(), domingo);
	}


	public Dia findDia(String name) {
		Assert.notNull(name, "El nombre del dia no  puede ser null");
		return dias.get(name);
	}

}
