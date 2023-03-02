package ar.edu.unlp.info.oo1.ejercicio8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class DistribuidoraTest {
	 private Distribuidora distri;
	 private Usuario pepe;
	 private Consumo consu1;
	 private Consumo consu2;
	  
	  

	  @BeforeEach
	  void setUp() throws Exception {
	    this.distri = new Distribuidora();
	    this.pepe = new Usuario("pepe", "madagascar");
	    

	  }

	  @Test
	  void testConstructor() {
		assertEquals("pepe", pepe.getNombre());
		assertEquals("madagascar", pepe.getDomicilio());
	   
	  }
	
	}	