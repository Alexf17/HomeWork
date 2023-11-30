//  1. Создайте новый элемент, добавьте ему текст и добавьте его после элемента с id "existingElement".

function createElementAfter() {
  let existingElement = document.querySelector("#existingElement");
  let paragraph = document.createElement("p");
  paragraph.innerText = "New Element";
  existingElement.after(paragraph);
}

// createElementAfter();

// 2. Создайте новый элемент , добавьте ему текст и вставьте его внутрь элемента с id "parentElement".

function createElementInto() {
  let existingElement = document.querySelector("#existingElement");
  let paragraph = document.createElement("p");
  paragraph.innerText = "New Element";
  existingElement.append(paragraph);
}

// createElementInto();

// 3. Удалите элемент с классом "removeMe".

function deleteElement() {
  let existingElement = document.querySelector("#existingElement");
  let block = document.createElement("div");
  block.setAttribute("class", "removeMe");
  existingElement.append(block);
  block.remove();
}

// deleteElement();

// 4. Создать множество карточек с товарами (на основе массива с объектами. У объекта свойства title, unit_price, count)

let products = [
  { title: "Product 1", unit_price: 10.9, count: 5 },
  { title: "Product 2", unit_price: 5, count: 8 },
  { title: "Product 3", unit_price: 20.4, count: 2 },
  { title: "Product 4", unit_price: 15.2, count: 10 },
  { title: "Product 5", unit_price: 8.9, count: 3 },
  { title: "Product 6", unit_price: 12.7, count: 7 },
  { title: "Product 7", unit_price: 18.3, count: 4 },
  { title: "Product 8", unit_price: 7.4, count: 6 },
  { title: "Product 9", unit_price: 14.9, count: 1 },
  { title: "Product 10", unit_price: 25.9, count: 9 },
];

function createCardsList() {
  let block = document.createElement("div");
  document.body.append(block);
  let list = document.createElement("ul");
  block.append(list);

  for (let i = 0; i < products.length; i++) {
    let item = document.createElement("li");
    list.append(item);
    let paragraph = document.createElement("p");
    paragraph.innerHTML = `<p>Name: ${products[i].title}</p><p>Price :${products[i].unit_price}</p><p>Count: ${products[i].count}</p>`;
    item.append(paragraph);
  }
}
// createCardsList();

// 5. Написать скрипт, который выводит карточки с товарами в интерфейс (на основе массива с объектами.
//  У объекта свойства title, unit_price, count), а внизу выводится итоговая сумма товаров и их количество.

function createCards() {
  let block = document.createElement("div");
  document.body.append(block);
  let list = document.createElement("ul");
  list.setAttribute(
    "style",
    "display: flex; flex-wrap: wrap; justify-content: center; gap: 10px; list-style: none;"
  );
  block.append(list);
  let sum = 0;
  let count = 0;

  for (let i = 0; i < products.length; i++) {
    let item = document.createElement("li");
    item.setAttribute("style", "border: 1px solid black; padding: 5px;");
    list.append(item);
    let paragraph = document.createElement("p");
    paragraph.innerHTML = `<p>Name: ${products[i].title}</p><p>Price: ${products[i].unit_price}</p><p>Count: ${products[i].count}</p>`;
    item.append(paragraph);
    sum += products[i].unit_price;
    count += products[i].count;
  }

  let paragraph = document.createElement("p");
  paragraph.innerText = `Сумма товаров: ${sum} \n Итоговое количество: ${count}`;
  list.after(paragraph);
}
createCards();
