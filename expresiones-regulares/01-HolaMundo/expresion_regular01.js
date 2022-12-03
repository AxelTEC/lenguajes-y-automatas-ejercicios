const cadena = "Mi nombre es Axel y tengo 18 años";
const regex = /nombre es ([a-zA-z]+) y tengo (\d+) años/;
const match = regex.exec(cadena);
if (match) {
	const edad = parseInt(match[2]),
		nombre = match[1];
	console.log(
		nombre +
			(edad < 0 || edad > 130
				? " tiene una edad no valida "
				: edad >= 18
				? " es mayor de edad "
				: " es menor de edad ") +
			edad
	);
} else {
	console.log("No Match...");
}

/* prueba 01 */
// const cadena = "Hola, estoy a punto de realizar una expresion regular"
// const regex = /punto/;
// const isHere = regex.test(cadena);
// console.log(isHere);

/* prueba 02 */
// const cadena = "Mi nombre es Juannnnnnnnn y tengo 20 años";
// const regex = /nombre es [A-Z][a-z]{1,11}\b/;
// const isHere = regex.test(cadena);
// console.log(isHere);

/* prueba 03 */
// const cadena = "Mi nombre es Axel y tengo 20 años";
// const regex = /nombre es ([a-zA-z]+) y tengo (\d+) años/;
// const match = regex.exec(cadena);
// console.log(match);
// const edad = parseInt(match[2]);
// console.log(edad);
// if (match) {
// 	const name = match[1];
// 	console.log(name);
// } else {
// 	console.log("No Match...");
// }

/* prueba 04 */
// if (
// 	parseInt(
// 		/nombre es ([a-zA-z]+) y tengo (\d+) años/.exec(
// 			"Mi nombre es Axel y tengo 19 años"
// 		)[2]
// 	) >= 21
// ) {
// 	console.log("Mayor de edad");
// } else {
// 	console.log("Menor de edad");
// }
