public class DataList {
        Node first, last;

        public DataList(){
            first = last = null;
        }
        public boolean isEmpty(){
            return first == null;
        }
        public void add(String data){
            if(isEmpty()){
                first = last = new Node(data);
            }
            else{
                last.next = new Node(data);
                last = last.next;
            }
        }
        public void print(){
            Node n = first;
            while(n != null){
                System.out.println(n.data);
                n = n.next;
            }
        }
        public boolean find(String target){
            Node n = first;
            while(!n.data.equals(target)){
                n = n.next;
            }
            return true;
        }
}
