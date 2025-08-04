/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
const middleNode = function(head) {
    if (!head) return null;
    let midHead = new ListNode(head.val, head.next)
    let endHead = new ListNode(head.val, head.next)
    while (endHead.next && endHead.next.next) {
        endHead = endHead.next.next
        midHead = midHead.next
    }
    if (endHead.next) {
        midHead = midHead.next
    }
    return midHead
};