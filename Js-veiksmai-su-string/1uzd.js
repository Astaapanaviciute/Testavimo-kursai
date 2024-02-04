window.onload = function() {
    let zodis = prompt("Įveskite žodį :");
    let galune = prompt("Įveskite žodžio galūnę :");

    console.log(zodis.length);
    console.log(zodis.at(-1));
    console.log(zodis.includes("taip"));
    console.log(zodzioGalune(zodis, galune));
   
}


function zodzioGalune(zodis, galune) {
    if (zodis.includes(galune)) {
        return true;
    }
    else {
        return false;
    }
}