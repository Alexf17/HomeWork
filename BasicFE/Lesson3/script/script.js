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

// let arr = [
//   { id: 12, firstname: "Olha", lastname: "Lone", age: 12, country: "UA" },
//   { id: 13, firstname: "Hana", lastname: "Tren", age: 19, country: "UsA" },
//   { id: 14, firstname: "Tom", lastname: "Doe", age: 24, country: "DE" },
//   { id: 15, firstname: "Rick", lastname: "Stew", age: 16, country: "PL" },
// ];
// for (let i = 0; i < arr.length; i++) {
//   if (arr[i].age > 18) console.log(arr[i]);
// }

// let user = {
//   firstName: "John",
//   lastName: "Smith",
//   age: 22,
//   gender: "Male",
// };
// arr.map((el) => console.log(el.firstname));

// function minNumber(string) {
//   let newString = "";
//   for (let i = string.length - 1; i >= 0; i--) {
//     newString += string[i];
//   }
//   return newString === string;
// }
// console.log(minNumber(prompt("Please enter a word")));

// function isIncluded() {
//   let arr = [3, 2, 6];
//   let num = 7;
//   let isInclude = false;
//   for (let i = 0; i < arr.length; i++) {
//     if (arr[i] === num) isInclude = true;
//   }
//   return isInclude;
// }
// console.log(isIncluded());

// function isIncluded(arr) {
//   let newArray = [];
//   for (let i = 0; i < arr.length; i++) {
//     if (!newArray.includes(arr[i])) newArray.push(arr[i]);
//   }
//   return newArray;
// }
// console.log(isIncluded([3, 2, 6, 1, 3, 4, 3]));

// function getElement(element) {
//   const newElement = document.querySelectorAll(element);
//   for (let i = 0; i < newElement.length; i++) {
//     newElement[i].style.border = "2px solid red";
//   }
// }
// getElement(p);

// let block = document.createElement("div");
// block.innerText = "Block1";
// document.body.prepend(block);

// let par = document.querySelector(".p1");
// par.after(block);

// for (let i = 0; i < 5; i++) {
//   let block = document.createElement("div");
//   block.innerText = `Block1 ${i}`;
//   document.body.append(block);
// }

// let par = document.createElement("p");
// par.innerText = "paragraph";
// let root = document.querySelector("#root");
// root.append(par);

// let ul = document.createElement("ul");
// document.body.append(ul);

// for (let i = 0; i < 4; i++) {
//   let li = document.createElement("li");
//   li.innerText = prompt("Enter");
//   ul.appendChild(li);
// }

// let arr = ["ae", "bb", "cc", "dsda", "dsdsa"];
// for (let i = 0; i < arr.length; i++) {
//   let p = document.createElement("p");
//   p.innerText = arr[i];
//   document.body.append(p);
// }

// let par = document.querySelector(".p");
// par.remove();

// let list = document.querySelector(".myList");
// let newList = document.createElement("li");
// newList.innerText = "new";
// list.prepend(newList);

// let source = prompt("Please enter address");
// let link = prompt("Please enter link");
// let img = document.createElement("img");
// img.setAttribute("src", source);
// document.body.append(img);
// let article = document.createElement("a");
// article.setAttribute("href", link);
// article.setAttribute("target", "_blank");
// article.innerText = "Link";
// document.body.append(article);

// let arr = [
//   { title: "ewrer", link: "http://google.com" },
//   { title: "wewew", link: "http://google.com" },
//   { title: "wewew", link: "http://google.com" },
// ];
// let root = document.querySelector("#root");
// for (let i = 0; i < arr.length; i++) {
//   let article = document.createElement("a");
//   article.setAttribute("href", arr[i].link);
//   article.innerText = arr[i].title;
//   root.append(article);
// }

// function createBlock(src, href) {
//   let block = document.createElement("div");
//   let img = document.createElement("img");
//   img.setAttribute("src", src);
//   img.setAttribute("alt", "SOME IMAGE");
//   let article = document.createElement("a");
//   article.setAttribute("href", href);
//   article.innerText = "Click here";

//   block.append(img, article);

//   return block;
// }
// link =
//   "https://static.islcollective.com/storage/preview/201508/766x1084/das-verb-sein-aktivitaten-spiele-grammatikubungen-spiele_81373_1.jpg";
// art = "https://google.com/";
// let newD = createBlock(link, art);
// document.body.append(newD);

// let button = document.querySelector("button");
// let par = document.querySelectorAll("p");
// // let div = document.querySelector(".ds");
// button.addEventListener("click", function () {
//   for (let i = 0; par.length > i; i++) {
//     par[i].innerText = i + 1;
//   }
//   // div.innerText = par.length;
// });

// let button = document.querySelector("button");
// let par = document.querySelector(".p1");
// let ar = document.querySelector("a");
// button.addEventListener("click", function () {
//   par.innerText = ar.getAttribute("href");
// });

// let button = document.querySelector("button");
// link = document.querySelectorAll("a");
// let newArray = [];
// button.addEventListener("click", function () {
//   for (let i = 0; link.length > i; i++) {
//     newArray.push(link[i].getAttribute("href"));
//   }
//   console.log(newArray);
// });

// let button = document.querySelector("button");
// let newP = "";
// button.addEventListener("click", function () {
//   if (newP == "") {
//     newP = document.createElement("p");
//     newP.innerText = "new";
//     document.body.appendChild(newP);
//   } else {
//     newP.remove();
//     newP = "";
//   }
// });

// let button = document.querySelector("button");
// let newP = "";
// button.addEventListener("click", function () {
//   if (newP == "") {
//     newP = document.createElement("ul");
//     newP.innerHTML = "<li>1</li><li>2</li>";
//     document.body.appendChild(newP);
//   } else {
//     newP.remove();
//     newP = "";
//   }
// });

// let button = document.querySelector("button");
// button.addEventListener("mouseover", function () {
//   button.style.backgroundColor = "red";

//   button.addEventListener("mouseout", function () {
//     button.style.backgroundColor = "green";
//   });
// });
