
const st = "The quick brown fox";
const sa = st.split(" ");
console.log(sa);

var toPigLatin = function (str) {
  return str.replace(/\b(\w)(\w+)\b/g, "$2$1ay");
};

sa.forEach((el) => {
  console.log(toPigLatin(el));
});
