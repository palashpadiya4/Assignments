class Person {
  constructor(first, middle, last) {
    this.first = first;
    this.middle = middle;
    this.last = last;
  }
}

let per1 = new Person("Palash", "Padiya");
per1.middle = "";
per1.last = "Padiya";
document.write(per1.first + " " + per1.middle + " " + per1.last);
