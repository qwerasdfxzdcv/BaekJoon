let fs = require('fs').readFileSync('/dev/stdin').toString().trim();
let input = Number(fs);
function fib(n) {
  if (n <= 1) return n;
  let result = [0, 1];
  for (let i = 2; i <= n; i++) {
    result.push(result[i - 1] + result[i - 2]);
  }
  return result[n];
}

console.log(fib(input));