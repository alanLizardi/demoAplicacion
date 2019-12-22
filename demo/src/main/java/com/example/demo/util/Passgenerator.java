package com.example.demo.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Passgenerator {

	public static void main(String... args) {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(4);
		// El String que mandamos al metodo encode es el password que queremos
		// encriptar.
		System.out.println(bCryptPasswordEncoder.encode("admin"));
	}
}




//user
//$2a$04$vVxBO.r9qHi2Gp/k.j7yLOLqwFiz3p3G5Q.c7uY1exbBdvKR8tPaO
//$2a$04$5Geld9Np20Yq/FQKSwS3xucGD6HhHFvky/dBHl/RZ9M8JczrZEk32

