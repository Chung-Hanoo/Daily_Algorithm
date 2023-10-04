import sys
sys.setrecursionlimit(10**4) # 재귀 최대 깊이 설정

class Node:
    def __init__(self, x, key):
        self.x = x
        self.key = key
        self.left = None
        self.right = None

class Tree:
    def __init__(self, root, x):
        self.root = Node(root, x)
    
    def insert(self, x, key):
        cur_node = self.root
        while True:
            if cur_node.x > x: # 좌
                if cur_node.left == None: 
                    cur_node.left = Node(x, key)
                    break
                else: cur_node = cur_node.left
                
            elif cur_node.x < x: # 우
                if cur_node.right==None: 
                    cur_node.right = Node(x, key)
                    break
                else: cur_node = cur_node.right
    
    def preorder(self):
        res = []
        
        def order(node):
            nonlocal res
            res.append(node.key)
            
            if node.left != None: 
                order(node.left)
                
            if node.right != None: 
                order(node.right)
                
        order(self.root)
        return res
        
    def postorder(self):
        res = []
        
        def order(node):
            nonlocal res
            if node.left != None: 
                order(node.left)
                
            if node.right != None: 
                order(node.right)
                
            res.append(node.key)
            
        order(self.root)
        return res

def solution(nodeinfo):
    for i, data in enumerate(nodeinfo):
        data.append(i+1)
    nodeinfo.sort(reverse=True, key=lambda x:x[1])
    
    tree = Tree(nodeinfo[0][0], nodeinfo[0][2])
    
    for i in nodeinfo[1:]: 
        tree.insert(i[0], i[2])
    
    answer = []
    
    answer.append(tree.preorder())
    answer.append(tree.postorder())
    
    return answer