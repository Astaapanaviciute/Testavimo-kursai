window.onload = function() {
    let zodis = "koldunas";
    let zodis2 = "KOLDUnas";
    console.log(arVienodiZodziai(zodis, zodis2));
}
function arVienodiZodziai(zodis, zodis2) {
    return zodis.toLocaleLowerCase() == zodis2.toLocaleLowerCase();
}