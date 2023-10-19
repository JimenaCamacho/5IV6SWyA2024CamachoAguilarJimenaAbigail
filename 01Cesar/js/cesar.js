const desplazamiento = document.getElementById("desplazamiento");
const texto = document.getElementById("texto");
const textoCifrado = document.getElementById("cifrado");

//vamos a crear uina funcion para cifrar
function cifrado() {
    //obtener el texto que se ingresa
    const textoIngresado = texto.value;
    //obtener caracter por caracter y validar la entrada del texto
    textoCifrado.value = textoIngresado.split('').map(c => {

        let mayus = (c === c.toUpperCase()) ? true : false;

        let valorEntero = c.toLowerCase().charCodeAt(0);

        if (valorEntero >= 97 && valorEntero <= 122) 
        {
            let valorDesplazamiento;

            if (desplazamiento.value === desplazamiento.value.toUpperCase()) 
            {
                valorDesplazamiento = parseInt(desplazamiento.value) % 26;
            }
            else 
            {
                valorDesplazamiento = (desplazamiento.value.toLowerCase().charCodeAt(0) - 96) % 26;
            }

            if (valorEntero + valorDesplazamiento > 122) 
            {
                valorEntero = 97 + (valorEntero - 122) + valorDesplazamiento - 1;
            } 
            else 
            {
                valorEntero += valorDesplazamiento;
            }

        }

        if (valorEntero >= 48 && valorEntero <= 57) {
            let valorDesplazamiento;

            if (desplazamiento.value === desplazamiento.value.toUpperCase()) {


                valorDesplazamiento = parseInt(desplazamiento.value) % 10;

            }
            else 
            {
                valorDesplazamiento = (desplazamiento.value.toLowerCase().charCodeAt(0) - 96) % 10;
            }

            if (valorEntero + valorDesplazamiento > 57) 
            {
                valorEntero = 48 + (valorEntero - 57) + valorDesplazamiento - 1;
            } 
            else 
            {
                valorEntero = valorEntero + valorDesplazamiento;
            }
        }
        let cifrado = String.fromCharCode(valorEntero);
        return mayus ? cifrado.toUpperCase() : cifrado;
    }).join('');
}


function descifrar() {
    // Obtener el texto cifrado que se ingresó
    const textoIngresado = texto.value;
    // Obtener el valor de desplazamiento


    textoCifrado.value = textoIngresado.split('').map(c => {
        let mayus = (c === c.toUpperCase()) ? true : false;
        let valorEntero = c.toLowerCase().charCodeAt(0);
        if (valorEntero >= 97 && valorEntero <= 122) 
        {
            let valorDesplazamiento;
            if (desplazamiento.value === desplazamiento.value.toUpperCase())
            {
                valorDesplazamiento = parseInt(desplazamiento.value) % 26;
                //console.log(valorDesplazamiento)
                //console.log(valorEntero);
            }
            
            else 
            {
                valorDesplazamiento = (desplazamiento.value.toLowerCase().charCodeAt(0) - 96) % 26;
            }

            if (valorEntero - parseInt(desplazamiento.value) < 97) 
            {


                valorEntero = (122 - Math.abs(valorEntero - parseInt(desplazamiento.value)-96)%26);

                console.log(valorEntero)
                
            }
            else 
            {
                valorEntero -= valorDesplazamiento;
            }

        }

        if (valorEntero >= 48 && valorEntero <= 57) 
        {
            let valorDesplazamiento = 0;
            if (desplazamiento.value === desplazamiento.value.toUpperCase()) 
            {

                valorDesplazamiento = parseInt(desplazamiento.value) % 10;

            }
            else 
            {

                valorDesplazamiento = (desplazamiento.value.toLowerCase().charCodeAt(0) - 96) % 10;
            }

            if (valorEntero - valorDesplazamiento < 48) 
            {
                valorEntero = 58 - (48 - valorEntero) - valorDesplazamiento ;
            } 
            else 
            {
                valorEntero -= valorDesplazamiento;
            }
        }
        let descifrado = String.fromCharCode(valorEntero);
        return mayus ? descifrado.toUpperCase() : descifrado;
    }).join('');
}

