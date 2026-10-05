package io.github.jakobfa.webtechproject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Workout {

	private String title;
	private int durationInMinutes;
	private int intensity;

}
