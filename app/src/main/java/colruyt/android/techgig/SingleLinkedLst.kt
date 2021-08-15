package colruyt.android.techgig
/*
["MyLinkedList","addAtHead","addAtHead","addAtHead","addAtIndex","deleteAtIndex","addAtHead","addAtTail","get","addAtHead","addAtIndex","addAtHead"]
[[],[7],[2],[1],[3,0],[2],[6],[4],[4],[4],[5,0],[6]]
 */

/*
["MyLinkedList","addAtHead","addAtTail","addAtIndex","get","deleteAtIndex","get"]
[[],[1],[3],[1,2],[1],[0],[0]]

Expected: [null,null,null,null,2,null,2]
Output:   [null,null,null,null,2,null,1]
 */
/*
Input:
["MyLinkedList","addAtIndex","addAtIndex","addAtIndex","get"]
[[],[0,10],[0,20],[1,30],[0]]
Output:
[null,null,null,null,10]
Expected:
[null,null,null,null,20]
 */

/*
Test this.
["MyLinkedList","addAtHead","get","addAtHead","addAtHead","deleteAtIndex","addAtHead","get","get","get","addAtHead","deleteAtIndex"]
[[],[4],[1],[1],[5],[3],[7],[3],[3],[3],[1],[4]]
 */

/*
["MyLinkedList","addAtHead","get","addAtHead","addAtHead","deleteAtIndex","addAtHead","get","get","get","addAtHead","deleteAtIndex"]
[[],[4],[1],[1],[5],[3],[7],[3],[3],[3],[1],[4]]
 */
/*
Input:
["MyLinkedList","addAtHead","get","addAtHead","addAtHead","deleteAtIndex","addAtHead","get","get","get","addAtHead","deleteAtIndex"]
[[],             [4],        [1],     [1],       [5],         [3],            [7],      [3], [3],   [3],   [1],       [4]]
Output:
[null,null,null,null,null,null,null,null,null,null,null,null]
Expected:
[null,null,-1,null,null,null,null,4,4,4,null,null]
 */
fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()

   /* val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val checkExists = CheckExists()
    val result =  checkExists.checkIfExist(arr.toIntArray())
    println("Result is $result")*/

    var linkedList = LinkedList<Int>()
    println("MyLinkedList is $linkedList")
    println("Add at Head")
    linkedList.push(84)
    println(linkedList)
    println("Add at Tail")
    linkedList.addAtTail(2)
    println(linkedList)
    println("Add at Tail")
    linkedList.addAtTail(39)
    println(linkedList)
    println("get(3)")
    println(linkedList.get(3))
    println("get(1)")
    println(linkedList.get(1))
    println("Add at Tail")
    linkedList.addAtTail(42)
    println(linkedList)
    println("add at Index [1,80]")
    linkedList.addAtIndex(1,80)
    println(linkedList)
    println("Add at Head")
    linkedList.push(14)
    println(linkedList)
    println("Add at Head")
    linkedList.push(1)
    println(linkedList)
    println("Add at Tail")
    linkedList.addAtTail(53)
    println(linkedList)
    println("Add at Tail")
    linkedList.addAtTail(98)
    println(linkedList)
    println("Add at Tail")
    linkedList.addAtTail(19)
    println(linkedList)
    println("Add at Tail")
    linkedList.addAtTail(12)
    println(linkedList)
    println("get(2)")
    println(linkedList.get(2))
    println("Add at Head")
    linkedList.push(16)
    println(linkedList)
    println("Add at Head")
    linkedList.push(33)
    println(linkedList)
    println("add at Index [4,17]")
    linkedList.addAtIndex(4,17)
    println(linkedList)
    println("add at Index [6,8]")
    linkedList.addAtIndex(6,8)
    println(linkedList)
    println("Add at Head")
    linkedList.push(37)
    println(linkedList)
    println("Add at Tail")
    linkedList.addAtTail(43)
    println(linkedList)
    println("deleteAtIndex")
    linkedList.deleteAtIndex(11)
    println(linkedList)
    println("addAtHead")
    linkedList.push(80)
    println(linkedList)
    println("addAtHead")
    linkedList.push(31)
    println(linkedList)
    println("addAtIndex [13,23]")
    linkedList.addAtIndex(13,23)
    println(linkedList)
    println("addAtTail [17]")
    linkedList.addAtTail(17)
    println(linkedList)
    println("get(4) is ${linkedList.get(4)}")
    println("addAtIndex [10,0]")
    linkedList.addAtIndex(10,0)
    println(linkedList)
    println("Add at Tail")
    linkedList.addAtTail(21)
    println(linkedList)
    println("addAtHead")
    linkedList.push(73)
    println(linkedList)
    println("addAtHead")
    linkedList.push(22)
    println(linkedList)
    println("add at Index [24,37]")
    linkedList.addAtIndex(24,37)
    println(linkedList)
    println("Add at Tail")
    linkedList.addAtTail(14)
    println(linkedList)
    println("addAtHead")
    linkedList.push(97)
    println(linkedList)
    println("addAtHead")
    linkedList.push(8)
    println(linkedList)
    println("get(6) is ${linkedList.get(6)}")
    println("deleteAtIndex 17")
    linkedList.deleteAtIndex(17)
    println(linkedList)
    println("Add at Tail")
    linkedList.addAtTail(50)
    println(linkedList)
    println("Add at Tail")
    linkedList.addAtTail(28)
    println(linkedList)
    println("addAtHead")
    linkedList.push(76)
    println(linkedList)
    println("Add at Tail")
    linkedList.addAtTail(79)
    println(linkedList)
    println("get(18) is ${linkedList.get(18)}")
    println("deleteAtIndex 30")
    linkedList.deleteAtIndex(30)
    println(linkedList)
    println("Add at Tail")
    linkedList.addAtTail(5)
    println(linkedList)
    println("addAtHead")
    linkedList.push(9)
    println(linkedList)
    println("Add at Tail")
    linkedList.addAtTail(83)
    println(linkedList)
    println("deleteAtIndex 3")
    linkedList.deleteAtIndex(3)
    println(linkedList)
    println("Add at Tail")
    linkedList.addAtTail(40)
    println(linkedList)
    println("deleteAtIndex 26")
    linkedList.deleteAtIndex(26)
    println(linkedList)
    //[53],[98],[19],[12]
   /* println("Add at Head")
    linkedList.push(4)
    println(linkedList)
    println("get(1) is ${linkedList.get(1)}")
    println("Add at Head 1")
    linkedList.push(1)
    println(linkedList)
    println("Add at Head 5")
    linkedList.push(5)
    println(linkedList)
    println("Delete at Index 3")
    linkedList.deleteAtIndex(3)
    println(linkedList)
    println("Add at Head 7")
    linkedList.push(7)
    println(linkedList)
    println("get(3) is ${linkedList.get(7)}")
    println("get(3) is ${linkedList.get(3)}")
    println("get(3) is ${linkedList.get(3)}")
    println("Add at Head 1")
    linkedList.push(1)
    println(linkedList)
    println("Delete at Index 4")
    linkedList.deleteAtIndex(4)
    println(linkedList)*/
   /* println("Add at index [0,10]")
    linkedList.addAtIndex(0,10)
    println(linkedList)
    linkedList.addAtIndex(0,20)
    println(linkedList)
    linkedList.addAtIndex(1,30)
    println(linkedList)
    println("get(0) ${linkedList.get(0)}")*/
  /*   println("Add at Head")
     linkedList.push(1)
     println(linkedList)
    println("Add at Tail")
    linkedList.addAtTail(3)
    println(linkedList)
    println("Add at Index 1 2")
    linkedList.addAtIndex(1,2)
    println(linkedList)
    println("get(1)")
    println(linkedList.get(1))
    println("delete at 0")
    (linkedList.deleteAtIndex(0))
    println(linkedList)
    println("get(0)")
    println(linkedList.get(0))*/
    /* linkedList.push(7)
    linkedList.push(2)
    linkedList.push(1)

    println(linkedList)

    println("Add at Index 3")
    linkedList.addAtIndex(3,0)
    println(linkedList)
    println("Delete at Index 2")
    linkedList.deleteAtIndex(2)
    println(linkedList)

    println("Add at Head 6")
    linkedList.push(6)
    println(linkedList)
    println("Add at Tail")
    linkedList.addAtTail(4)
    println(linkedList)
    println("get at Index 4")
    println("${ linkedList.get(4)}")
    println("Add at Head 4")
    linkedList.push(4 )
    println(linkedList)
    println("Add at Index [5,0]")
    linkedList.addAtIndex(5,0)
    println(linkedList)
    println("Add at Head 5")
    linkedList.push(6)
    println(linkedList)*/


}
data class Node<T>(var value: T, var next: Node<T>? = null) {
    override fun toString(): String {

        return if (next != null) {
            "$value -> ${next.toString()}"
        } else {
            "$value"
        }
    }
}

class LinkedList<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null
    private var size = 0

    fun isEmpty(): Boolean {
        return size == 0
    }

    override fun toString(): String {
        return if (isEmpty()) {
            "Empty list"
        } else {
            head.toString()
        }
    }
    fun push(value: T) {
      println("size and Value is $size and $value")
        head = Node(value = value, next = head)
        if (tail == null) {
            tail = head
        }
        size++
       println("Updated size is $size")
    }

    fun addAtTail(value: T) {
        if (isEmpty()) {
            push(value)
            return
        }
        // 2
        tail?.next = Node(value = value)

        // 3
        tail = tail?.next

        size++
    }

    //Get Node at Index
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    fun get(index: Int): Int? {
        println("Index and size is $index and $size")
        // 1
        var currentNode = head
        var currentIndex = 0
        return if(index >= size) {
            -1
        } else{
            // 2
            while (currentNode != null && currentIndex < index) {
                currentNode = currentNode.next
                currentIndex++

            }
            currentNode?.value.toString().toInt()


        }


    }

    fun addAtIndex(index: Int, `val`: T) {
    var currentNode = head
        var newNode:Node<T>? = null
        var previousNode:Node<T>? = null
        var currentIndex = 0
       if(index >= size){
          addAtTail(`val`)

       }else if(size > 0 && index == 0){
          push(`val`)
        }
       else {
           while (currentNode != null && currentIndex < index) {
               previousNode = currentNode
               currentNode = currentNode.next
               currentIndex++
           }
           newNode = Node(value = `val`, next = currentNode)
           previousNode?.next = newNode
           size++
       }


    }


    /** Delete the index-th node in the linked list, if the index is valid. */
    fun deleteAtIndex(index: Int) {
        // 1
        var currentNode = head
        var currentIndex = 0
        var previousNode: Node<T>? = null
        if (index < size) {
            if (index == 0) {
                if (size > 1) {
                    head = currentNode?.next
                    currentNode?.next = null
                    size--
                } else if (size == 1) {
                    currentNode = null
                    size--
                }
            } else {
                // 2
                while (currentNode != null && currentIndex < index) {
                    previousNode = currentNode
                    currentNode = currentNode.next
                    currentIndex++

                }
                previousNode?.next = currentNode?.next
                currentNode?.next = null
                if(previousNode?.next == null){
                    tail = previousNode
                }
                size--
            }


        }
    }
}


