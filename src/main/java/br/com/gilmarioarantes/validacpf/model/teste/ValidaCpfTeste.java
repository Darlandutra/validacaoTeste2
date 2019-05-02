package br.com.gilmarioarantes.validacpf.model.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import br.com.gilmarioarantes.validacpf.model.ValidaCPF;
import junit.framework.Assert;

public class ValidaCpfTeste {
	
	private ValidaCPF validaCpf;
	
	@Before
	public void setup() {
		
		validaCpf = new ValidaCPF();
	}	
//	
//	@Test
//	public void ValidaCpf() {
//		Assert.assertTrue(validaCpf.isCPF("00546709184"));
//	}
//	
//	@Test
//	public void ValidaCpfErro() {
//		Assert.assertTrue(validaCpf.isCPF("005"));
//	}
	
	@Test
	public void Valida() {
		Assert.assertTrue(validaCpf.isCPF("000000000191"));
	}
	
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

}
