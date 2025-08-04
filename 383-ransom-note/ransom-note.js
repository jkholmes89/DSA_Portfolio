/**
 * @param {string} ransomNote
 * @param {string} magazine
 * @return {boolean}
 */
const canConstruct = function (ransomNote, magazine) {
  const
   magazineMap = new Map();
  for (let c of magazine) {
    magazineMap.set(c, magazineMap.get(c) + 1 || 1);
  }
  for (let c of ransomNote) {
    if (magazineMap.get(c)) magazineMap.set(c, magazineMap.get(c) - 1);
    else return false;
  }
  return true;
};