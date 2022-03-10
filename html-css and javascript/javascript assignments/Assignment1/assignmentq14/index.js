
const arrran = Array.from({ length: 100 }, () =>
Math.floor(Math.random() * 40)
);
console.log(arrran);
console.log(Math.max(...arrran));
console.log(Math.min(...arrran));

let evens = arrran.filter((number) => number % 2 == 0);
let odds = arrran.filter((number) => number % 2 == 1);

if (evens > odds) {
console.log(evens);
} else {
console.log(odds);
console.log(odds.length);
}
