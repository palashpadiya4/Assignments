var x = "hello\nworld\nin\na\nframe";

function star(str) {
  let arr = [];
  arr = str.split("\n");
  for (let index = 0; index < 1; index++) {
    console.log("*******");
    for (let j = 0; j <= arr.length; j++) {
      console.log("*" + arr[j] + "*" );
    }
  }
  console.log("******");
  return arr;
}
console.log(star(x));