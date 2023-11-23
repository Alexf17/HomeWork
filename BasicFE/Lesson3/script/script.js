// let arr = [4, 3, 9, 7, 2, 1];
// for (let i = 0; i < arr.length; i++) {
//   let sqrt = Math.sqrt(arr[i]);
//   let round = Math.round(n);
//   if (sqrt === round) {
//     arr[i] = sqrt;
//   } else {
//     arr[i] = arr[i] ** 2;
//   }
// }
// console.log(arr);

// let arr = [
//   "сено",
//   "мусор",
//   "сено",
//   "сено",
//   "песок",
//   "иголка",
//   "трава",
//   "иголка",
// ];
// for (let i = 0; i < arr.length; i++) {
//   if (arr[i] == "иголка") console.log(`Найдена иголка на позиции ${i}`);
// }

// let cube1 = [2, 2, 3];
// let cube2 = [5, 4, 1];
// let v1 = 1;
// let v2 = 1;
// for (let i = 0; i < 3; i++) {
//   v1 = v1 * cube1[i];
//   v2 = v2 * cube2[i];
// }
// // let v1 = cube1[0] * cube1[1] * cube1[2];
// // let v2 = cube2[0] * cube2[1] * cube2[2];
// if (v1 > v2) {
//   console.log(v1 - v2);
// } else {
//   console.log(v2 - v1);
// }

let arr = [
  { id: 12, firstname: "Olha", lastname: "Lone", age: 12, country: "UA" },
  { id: 13, firstname: "Hana", lastname: "Tren", age: 19, country: "UsA" },
  { id: 14, firstname: "Tom", lastname: "Doe", age: 24, country: "DE" },
  { id: 15, firstname: "Rick", lastname: "Stew", age: 16, country: "PL" },
];
// for (let i = 0; i < arr.length; i++) {
//   if (arr[i].age > 18) console.log(arr[i]);
// }

let user = {
  firstName: "John",
  lastName: "Smith",
  age: 22,
  gender: "Male",
};
arr.map((el) => console.log(el.firstname));
