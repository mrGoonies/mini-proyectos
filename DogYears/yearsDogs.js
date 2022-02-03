const ageCalculator = age => {
	const formula = (16 * age) + 31;

	alert(`La edad humana de su mascota es: \n${formula}`);
}

// función recursiva!
const validateAge = age => {
	if (age > 0) {
		return age;
	} else {
		return validateAge(dogAge());
	}
}

// Solicitamos la edad de la mascota
const dogAge = () => {
	const age = prompt('Ingrese la edad de su mascota (perro)');

	return age;

}

// Entry Point
const main = () => {
	alert('Calcularemos la edad de tu mascota');
	
	let input = validateAge(dogAge());

	alert(`Su mascota tiene la edad de ${input}`);
	ageCalculator(input)

}

main();
