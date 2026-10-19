package mx.unadm.dpo3_u2_a2_ervv;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class NotificacionPedidosApplication {

	public static void main(String[] args) {
		// Spring Boot arranca en modo headless por defecto; Swing necesita que sea false
		new SpringApplicationBuilder(NotificacionPedidosApplication.class)
				.headless(false)
				.run(args);

		System.out.println("[" + Thread.currentThread().getName() + "] Aplicación iniciada.");

		// En el siguiente paso aquí se abrirá la ventana principal
	}
}
