/**
 * @param {number[][]} accounts
 * @return {number}
 */
const maximumWealth = function (accounts) {
  return accounts.reduce((max, cust) => {
    total = cust.reduce((acc, val) => (acc += val));
    total > max ? (max = total) : (max = max);
    return max;
  }, 0);
};