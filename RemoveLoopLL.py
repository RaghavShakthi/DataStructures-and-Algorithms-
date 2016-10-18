class Node(object):
    def __init__(self,data=None,next_node=None, visit=0):
        self.data=data
        self.next_node = next_node
        self.visit = visit

class linkedList(object):
    def __init__(self,head=None):
        self.head=head

    def create(self,data):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def insert(self,data):
        new_node = Node(data)
        temp = self.head
        while temp.next:
            temp = temp.next
        temp.next = new_node
        new_node.next = None

    def printLL(self):
        temp = self.head
        while temp!= None:
            print temp.data
            temp = temp.next

    def removeLoop(self):
        temp = self.head
        while temp.next != None:
            if temp.next.visit != 1:
                temp.visit = 1
                temp=temp.next
            else:
                temp.visit = 1
                temp.next = None



o = linkedList()
o.create(3)
o.insert(4)
o.insert(5)
o.insert(2)
o.insert(7)
# o.printLL()

o.head.next.next.next.next.next = o.head.next
o.removeLoop()
o.printLL()
