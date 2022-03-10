const arr3 = ["a", "b", "c"];
const arr4 = [1, 2, 3];
const newarr = [];

for (let i = 0; i < arr3.length; i++) {
  newarr.push(arr3[i]);
  newarr.push(arr4[i]);
}
console.log(newarr);