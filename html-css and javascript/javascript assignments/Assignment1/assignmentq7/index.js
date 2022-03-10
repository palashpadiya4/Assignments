
const dollar_to_other = (dollars) => {
    const rs = dollars * 74;
    const yen = dollars * 109;
    const euro = 0.84 * dollars;
    const pound = dollars * 0.72;
  
    const li = [rs, yen, euro, pound];
    console.log(li);
  };
  
  dollar_to_other(3);