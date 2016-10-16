

class Node(object):
    def __init__(self,data=None,next_node=None):
        self.data=data
        self.next_node = next_node

class linkedList(object):
    def __init__(self,head=None):
        self.head=head

    def create(self,data=None):
        new_node = Node(data)
        new_node.next = self.head
        self.head = new_node

    def insert(self,data):
        new_node = Node(data)
        if self.head==None:
            self.head = new_node
        else:
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

def add_ll(obj1, obj2, fin):
    temp1 = obj1.head
    temp2 = obj2.head
    #temp3 = fin.head
    sum1 = 0
    carry_over = 0
    while temp1!= None and temp2!= None:
        sum1 = temp1.data + temp2.data+carry_over
        fin.insert(sum1%10)
        carry_over = sum1/10
        temp1 = temp1.next
        temp2 = temp2.next

    while temp1!=None:
        fin.insert(temp1.data)
        temp1 = temp1.next

    while temp2!=None:
        fin.insert(temp2.data)
        temp2 = temp2.next



ll1=linkedList()
ll1.create(5)
ll1.insert(6)
ll1.insert(3)
ll1.insert(2)
ll2=linkedList()
ll2.create(8)
ll2.insert(4)
ll2.insert(2)
ll3=linkedList()
ll3.create()
add_ll(ll1,ll2,ll3)
ll3.printLL()




