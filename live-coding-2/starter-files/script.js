// API
const API_ENDPOINT = 'https://yesno.wtf/api';

 let boton = document.getElementById("button");


  boton.addEventListener("click", funcionFetch)

  function funcionFetch() {
        fetch('https://yesno.wtf/api')
         .then((response) => response.json())
         .then((data) => {
            
         });
  }

/**
 * STEPS:
 *
 * 1. Create a fetchAnswer function and call the API
 * 2. Output the API's response
 * 3. Attach fetchAnswer to an event listener
 * 4. Clear output after 3 seconds
 * 5. Optional: add loading/error states
 *
 */
