public class DataList {
        Node first, last;

        public DataList(){
            first = last = null;
        }
        //simple boolean to check if list is empty.
        public boolean isEmpty(){
            return first == null;
        }
        //adds an element to the list, if list is empty, both first and last node are set to the new node created.
        public void add(String data){
            if(isEmpty()){
                first = last = new Node(data);
            }
            else{
                last.next = new Node(data);
                last = last.next;
            }
        }
        //prints out all node data.
        public void print(){
            Node n = first;
            while(n != null){
                System.out.println(n.data);
                n = n.next;
            }
        }
        //Searches list to see if any node contains target.
        public boolean find(String target){
            Node n = first;
            while(!n.data.equals(target)){
                n = n.next;
            }
            return true;
        }
}
