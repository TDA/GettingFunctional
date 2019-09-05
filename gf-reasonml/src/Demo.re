Js.log("Hello, BuckleScript and Reason! I am Sai Pc!");
let greetMore = name => {
  let part1 = "Hello";
  part1 ++ " " ++ name;
};

Js.log(greetMore("stephan"));

let rec fibonacciTailRecursion = (number, first, second) =>
  number == 0
    ? second : fibonacciTailRecursion(number - 1, first + second, first);

for (x in 1 to 10) {
  Js.log(fibonacciTailRecursion(x, 0, 1));
};

// I fail to see why there is a need for ReasonML.. it complicates
// JS syntax by introducing OCaml, and then compiles it to very poor JS
// which realistically I could have handcoded much much better
// The only diff is the type safety/inference, which IMO is just the same as TS.
let rec fibonacciRegularRecursion = (x: int) =>
  switch (x) {
  | _ when x < 2 => 0
  | _ when x == 2 => 1
  | _ => fibonacciRegularRecursion(x - 1) + fibonacciRegularRecursion(x - 2)
  };

for (x in 1 to 10) {
  Js.log(fibonacciRegularRecursion(x));
};
