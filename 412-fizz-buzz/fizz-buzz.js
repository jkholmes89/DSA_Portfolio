/**
 * @param {number} n
 * @return {string[]}
 */
const fizzBuzz = function (n) {
  const out = [];
  for (let i = 1; i <= n; i++) {
    if (i % 3 === 0) {
      if (i % 5 === 0) out.push("FizzBuzz");
      else out.push("Fizz");
    } else if (i % 5 === 0) out.push("Buzz");
    else out.push(i + "");
  }
  return out;
};