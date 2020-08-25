package com.stereotype.annotations;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("toy")
@Lazy
public class Toy {

	public Toy() {
		System.out.println("Toy()");
	}
	public void play() {
		System.out.println("Playing....");
	}
}
