class Person {
	constructor(name, age, dni) {
		this._name = name;
		this._age = age;
		this._dni = dni;
	}

	get name() {
		return this._name;
	}

	get age() {
		return this._age;
	}

	get dni() {
		return this._dni;
	}

	showData() {
		console.log('===== Información usuario =====');
		console.log(`Nombre: ${this._name}\nEdad: ${this._age}\nDNI: ${this._dni}`);
		console.log('===============================');
	}

	olderPerson() {
		this._age >= 18 ? console.log('Es mayor de edad') : console.log('Es menor de edad');
	}



}


// Instanciando clase:
const object1 = new Person('Gabriel Muñoz', 23, '20.129.497-5');

object1.showData();
object1.olderPerson();
