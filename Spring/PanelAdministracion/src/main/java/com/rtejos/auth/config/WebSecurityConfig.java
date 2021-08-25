package com.rtejos.auth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	 private UserDetailsService userDetailsService;

	 public WebSecurityConfig(UserDetailsService userDetailsService) {
		 this.userDetailsService = userDetailsService;
	 }
	
	
	// Agregar Bcyrpt bean
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
	
	

	@Override 
	protected void configure(HttpSecurity http) throws Exception {
		http.
			authorizeRequests()
				.antMatchers("/css/**", "/js/**", "/registration").permitAll()
			//	.antMatchers("/static/**","/registration").permitAll()
				.antMatchers("/admin/**").access("hasRole('ADMIN')")
		  		.anyRequest().authenticated()
		  		.and()
		  	.formLogin()
		  		.loginPage("/registration")
		  		.permitAll()
		  		.and()
		  	.logout()
		  		.permitAll();
	}
	
	@Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder());
    }
	 

	/*
	 * authorizeRequests(): Permite restringir el acceso basado en
	 * HttpServletRequest. .antMatchers("/css/**", "/js/**, "/registration"):
	 * Implementación de PathMatcher para los patrones de ruta Ant-style.
	 * 
	 * La asignación coincide con las URL usando las siguientes reglas: ? Coincide
	 * con un caracter. Coinciden con cero o más caracteres. Coincide con cero o más
	 * directorios en una ruta. {spring:[a-z]+} Coincide con la expresión regular
	 * [a-z]+ una variable de ruta llamada "spring" Ejemplos:
	 * 
	 * com/t?st.jsp — Coincide con com/test.jsp pero también con com/tast.jsp o
	 * com/txst.jsp. com.jsp — Coincide con todos los archivos .jsp en el directorio
	 * com. com/*test.jsp — Coincide con todos los archivos test.jsp bajo la ruta
	 * com. org/springframework*.jsp — Coincide con todos los archivos .jsp bajo la
	 * ruta org/springframework. orgservlet/bla.jsp — Coincide con
	 * org/springframework/servlet/bla.jsp pero también con
	 * org/springframework/testing/servlet/bla.jsp and org/servlet/bla.jsp
	 * com/{filename:\w+}.jsp coincidirá con com/test.jsp y asignará el valor test a
	 * la variable filename. En nuestro ejemplo, estamos permitiendo que todo lo que
	 * coincida con "/static" y "/registration" sea permitido para cualquiera.
	 * "/static" es para nuestros activos y "/registration" es para las solicitudes
	 * de registro GET y POST. .anyRequest(): Asigna cualquier solicitud.
	 * .authenticated(): Especifica las URL permitidas solo para los usuarios
	 * autenticados. .formLogin(): Especifica el formulario de soporte basado en la
	 * autenticación. Ahora nuestros usuarios van a autenticarse mediante un
	 * formulario. .loginPage("/login"): Especifica la URL a la que se envían los
	 * usuarios si requieren iniciar sesión. logout(): Proporciona soporte para
	 * cerrar la sesión. Por defecto el acceso a la URL "/logout" cerrará la sesión
	 * del usuario mediante la invalidación de la sesión HTTP, limpia cualquier
	 * autenticación rememberMe() que haya sido configurada, borra el
	 * SecurityContextHolder, y luego redirecciona a "/login?success".
	 */

}