class grand_parent:
    def gparent(self):
        print("This function is for grand parent")


class parent(grand_parent):
    def parentt(self):
        print("This function is for parent")


class grand_child(parent):
    def child(self):
        print("This function is for grand child")


obj = grand_child()
obj.child()
obj.parentt()
obj.gparent()