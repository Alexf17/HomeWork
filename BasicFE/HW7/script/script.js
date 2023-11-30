// 1. Написать функцию, получающую на вход два числа.Если оба числа чётные -функция возвращает их произведение.Если оба числа нечётные - функция возвращает их сумму.Если одно из чисел чётное, а второе нечётное - функция возвращает это нечётное число.

function evenNumber(num1, num2) {
  let a = num1 % 2 != 0;
  let b = num2 % 2 != 0;
  if (!a && !b) {
    console.log(num1 * num2);
  } else if (a && b) {
    console.log(num1 + num2);
  } else {
    console.log(a ? num1 : num2);
  }
}

evenNumber(
  +prompt("Please enter a first number"),
  +prompt("Please enter a second number")
);

// 2. Написать  функцию, которая параметром будет принимать секунды, а возвращать количество суток, соответствующих этим секундам.

function getDays(seconds) {
  let days = seconds / 86400;
  console.log(`It is around ${days.toFixed(2)} days`);
}
getDays(+prompt("Please enter seconds and then I convert them to days"));

// 3. Написать функцию isPrime, которая принимает число и возвращает true, если оно простое (имеет только два делителя: 1 и само число), и false в противном случае.

function isPrime(number) {
  let isPrimeNum = true;
  for (let i = 2; i < number; i++) {
    if (number % i == 0) {
      isPrimeNum = false;
    }
  }
  console.log(isPrimeNum);
}
isPrime(+prompt("enter please one number"));

// 4. Написать функцию, которая в качестве аргументов получает два числа и выводит в консоль наименьшее.

function minNumber(num1, num2) {
  if (num1 < num2) {
    console.log(num1);
  } else if (num1 == num2) {
    console.log("Numbers are equal");
  } else {
    console.log(num2);
  }
}

minNumber(
  +prompt("Please enter a first number"),
  +prompt("Please enter a second number")
);

// 5. Написать  функцию, которая в качестве аргументов получает два числа и возвращает массив чисел со значениями от меньшего числа к большему.

function createArray(num1, num2) {
  let newArray = [];
  if (num1 === num2) {
    return console.log(
      "Please enter new numbers , these numbers will be not equal"
    );
  }
  let start = num1 > num2 ? num1 : num2;
  let end = num1 < num2 ? num2 : num1;
  console.log(start, end);
}
createArray(
  +prompt("Please enter a first number"),
  +prompt("Please enter a second number")
);
