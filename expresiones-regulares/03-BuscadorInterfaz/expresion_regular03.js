/* Constantes y Variables */
let data = [];
const url = "https://alimentos-1e1ff-default-rtdb.firebaseio.com/SMAE.json"; //url de firebase
const $container = document.querySelector(".container");
const $dataH2 = document.querySelector("h2");
const $input = document.querySelector("input[type='text']");

/* Funciones para manipular los datos, almacenarlos en local storage y ahorrar peticiones en firebase */
const getData = async () => {
	if (!localStorage.getItem("SMAE")) {
		console.info("Obteniendo la información del servidor...");
		const res = await fetch(url);
		data = await res.json();
		localStorage.setItem("SMAE", JSON.stringify(data));
	} else {
		console.info("Obteniendo la información del LocalStorage...");
		data = await JSON.parse(localStorage.getItem("SMAE"));
	}
};

const searchData = (e) => {
	e.preventDefault();
	if ($input.value.length < 3) {
		$container.innerHTML = "";
		$dataH2.innerText = `Datos encontrados: 0`;
		alert("La busqueda debe contener al menos 3 letras");
		return;
	}
	const regex = new RegExp(`${$input.value}`, "i");
	$container.innerHTML = "";
	let size = 0;
	data.forEach((v) => {
		if (regex.test(v.Alimento)) {
			size++;
			$container.innerHTML += `
				<div class="item">
					<h3 class="item-header">${v.Alimento}</h3>
					<ul class="item-list">
						<li><b>Categoría: </b> ${v.Categoría}</li>
						<li><b>Cantidad disponible: </b> ${v.Cantidad}</li>
						<li><b>PesoBrutoG: </b> ${v.PesoBrutoG}</li>
						<li><b>EnergíaKcal: </b> ${v.EnergíaKcal}</li>
					</ul>
				</div>
			`;
		}
	});
	$dataH2.innerText = `Datos encontrados: ${size}`;
	if (size == 0)
		$container.innerHTML = `<h4>❌😯No se han encontrado coincidencias😯❌</h4>`;
};

/* Eventos */
document.addEventListener("DOMContentLoaded", getData);
document.addEventListener("submit", searchData);
