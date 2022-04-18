// program to convert date to number
// create date
const d1 = new Date(2022,12, 31);
console.log(d1);

// converting to number
const result = d1.getTime();
console.log(result);

var data = {
  "rules": {
    ".read": "now < 1675141200000",  // 2022-12-31
    ".write": "now < 1675141200000",  // 2022-12-31
  }
};

console.log(data);
