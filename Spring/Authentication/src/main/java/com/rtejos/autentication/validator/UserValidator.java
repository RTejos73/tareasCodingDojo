package com.rtejos.autentication.validator;



import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.rtejos.autentication.models.User;


//@Component. A continuación está la explicación de esta anotación proporcionada por la documentación de Spring
@Component
public class UserValidator implements Validator {
	
	//1
	//supports(Class<?>): Especifica que una instancia del modelo User puede ser validada con este validador personalizado.
	@Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }
	
	//2
	//validate(Object, Errors): Crea nuestra validación personalizada. Podemos agregar errores vía.rejectValue(String, String).
	@Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;
        
        if (!user.getPasswordConfirmation().equals(user.getPassword())) {
            // 3
        	//.rejectValue(String, String): El primer argumento es la variable de nuestro modelo que estamos validando. El segundo argumento es un código que podemos usar para establecer un mensajes de error.
            errors.rejectValue("passwordConfirmation", "Match");
        }         
    }
	
	
	
	/*
	 * Spring proporciona más anotaciones de estereotipos: @Component, @Service,
	 * y @Controller. @Component es un estereotipo genérico para cualquier
	 * componente administrado por Spring. @Repository, @Service, y @Controller son
	 * especializaciones de @Component para casos más específicos, por ejemplo, en
	 * las capas de persistencia, servicios y presentación respectivamente. Por lo
	 * tanto, puede colocar anotaciones a sus clases Component con @Component, pero
	 * al anotarlas con @Repository, @Service, o @Controller, sus clases son más
	 * adecuadas para ser procesadas.
	 */
}
