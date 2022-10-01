
let lista = document.getElementById("listaul");

function printArray(array){
    let elemento;
    let number;

    for(let i=0; i<array.length; i++){

        elemento = document.createElement("li");
        number = document.createTextNode(array[i]);
        elemento.appendChild(number);
        lista.appendChild(elemento);
    }
}

let array = [1,2,3,4,5,6];
printArray(array);