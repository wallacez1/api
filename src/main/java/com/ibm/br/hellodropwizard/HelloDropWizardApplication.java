package com.ibm.br.hellodropwizard;

import org.hibernate.validator.constraints.NotEmpty;

import com.ibm.br.hellodropwizard.resources.CalculadoraResource;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class HelloDropWizardApplication extends Application<HelloDropWizardConfiguration> {

    public static void main(final String[] args) throws Exception {
        new HelloDropWizardApplication().run(args);
    }

    @Override
    public String getName() {
        return "HelloDropWizard";
    }

    @Override
    public void initialize(final Bootstrap<HelloDropWizardConfiguration> bootstrap) {
        // TODO: application initialization
    }

	@Override
	public void run(HelloDropWizardConfiguration configuration, Environment environment) throws Exception {
        CalculadoraResource calculadoraresource = new CalculadoraResource();
        environment.jersey().register(calculadoraresource);
		
	}


  
    
    

}
