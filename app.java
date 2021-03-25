class MyList<E> implements SimpleList<E> {
    private Node<E> head;
    private int size;

    public MyList(){
       head = new Node();   // 노드 있으니까 head != null
       size = 0;
    }
    
    public int size(){
        return size;
    }

    public boolean isEmpty(){
        Node p = head;     // head부터 움직일 node p
        if(p.next == null){ 
            return false;
        } else {
            return true;
        }
    }

    public void add(int index, E element){
        Node p = head;
        int i=0;
        while(p.next != null) {  // p.next가 있을 동안 반복
            if(i >= index){    // p.next.data가 index보다 크면
                break;                  // 다음꺼 읽는거 그만하고 while 빠져나가
            }
            p = p.next;    // p 순회
            i++;
        }
        
        Node newNode = new Node(element, p.next);     //ex) index = 3, while에서 p.data = 2에서 break 그러므로 기존 p.next 연결할 new Node 생성 
        p.next = newNode;                           // 그 후 p다음꺼를 new Node와 연결시키기

        size++;
    }
   
    public void add(E element){ 
        Node p = head;
        Node newNode = new Node(element);

        while(p.next != null) {
            p = p.next;    
        }
        p.next = newNode;

        size++;
    }

    public E remove(int index){
        Node p = head;
        int i=0;
        if(head.next == null || index > size){     // head의 next 없으면 종료
            return null;
        }

        if(index==0){    // 처음이면 그냥 바로
            size--;
            Node tmp = p;
            p.next = p.next.next;
            return (E) tmp.data;
        }
        
        Node tmp = null;
        while(p.next != null){
            if(i >= index){   //  index=3, p.data = 2 이면 멈춰
                tmp = p.next;           // 출력할 tmp 노드에 next 저장
                p.next = p.next.next;   // p.next 한번 더 넘겨서 연결
                break;
            }
            p = p.next;
            i++;
        }
        		
        size--;
        return (E) tmp.data;
    }

    public E remove(){
        Node p = head;

        if(p.next == null){
            return null;
        } else{
            while(p.next != null){
                p = p.next;
            }
            Node tmp = p;
            p = null;

            size--;
            return (E) tmp.data;
        }

    }

    public E get(int index){
        Node p = head;
        int i=0;
        while(p.next != null) {
            if(i == index){       // ex) index = 3 -> p.next.data=3, 즉 p.data=2일때 순회 정지
                break;
            }
            p = p.next;
            i++;
        }
        
        return (E) p.next.data;         // while 정지 후 return 해야 할 값 주의
    }
}

//