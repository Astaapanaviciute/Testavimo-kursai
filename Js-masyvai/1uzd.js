window.onload = function() {
    const masyvas = [3, 5, 6, 8];
    console.log(masyvas);
    console.log(masyvas.length);
    masyvas.push(3, 5, 6.325);
    console.log(masyvas);
    masyvas.unshift(10, 0, 0, 10);
    console.log(masyvas);
    console.log(masyvas.lenth);
    masyvas.shift();
    console.log(masyvas);
    masyvas.pop();
    masyvas.pop();
    console.log(masyvas);
    const naujasMasyvas = ["lol", "taip", "ne", "lmao"];
    console.log(naujasMasyvas);
}