input = 17;

sum = 0;

for (let i = 0; i < input; i++) {
  if (i % 3 == 0) sum += i;
}

console.log(sum);