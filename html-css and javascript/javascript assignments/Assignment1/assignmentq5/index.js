let curr = 2022;
let times = 0;
let li = [];

while (times != 20) {
  if (curr % 4 == 0) {
    li.push(curr);
    times++;
  }
  curr++;
}
console.log(li);