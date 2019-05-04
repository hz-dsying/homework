package day0504;

public class MyLinkedList {
	private Node head = new Node();//头节点，next=null
	private int size = 0;//有效节点个数，0
	
	/**
	 * 节点类就是为了LinkedList来服务的，所以定义成内部类
	 * 节点中包含两部分：保存数据用的data，指向下一个节点的next
	 */
	public class Node{
		private Object data;//存储数据
		private Node next;//保存下一个节点的引用
	}
	//完成的方法参考MyArrayList
	
	/**
	 * 向集合(this)的末尾中添加元素
	 */
	public void add(Object obj) {
		/*//只能从头开始，找到链表的末尾
		Node node = head;
		while(node.next != null) {//链表没到末尾
			//让node指向下一个节点
			node = node.next;
		}
		//node就是最后一个元素
		//创建新的节点
		Node newNode = new Node();
		newNode.data = obj;
		//新的节点加入到链表结构中
		node.next = newNode;
		//个数+1
		size++;*/
		add(size, obj);

	}
	/**
	 * 向集合index的位置中插入obj元素
	 */
	public void add(int index, Object obj) {
		//判断index是否合法
		if(index < 0 || index > size) {
			return;
		}
		Node node = head;
		//寻找index位置之前的一个节点
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		//创建新的节点
		Node newNode = new Node();
		newNode.data = obj;
		//插入节点
		newNode.next = node.next;
		node.next = newNode;
		//个数+1
		size++;
		
	}
	/**
	 * 获得集合的元素个数
	 */
	public int size() {
		return size;
	}
/*	private Node getPreNode(int index) {
		return null;
	}*/
	/**
	 * 从集合中获得指定位置(index)的元素
	 */
	public Object get(int index) {
		if(index < 0 || index > size) {
			return null;
		}
		Node node = head;
		for(int i = 0; i <= index; i++) {
			node = node.next;
		}
		return node.data;
	}
	/**
	 * 删除指定位置(index)上的元素，并且返回删除元素
	 */
	public Object remove(int index) {
		if(index < 0 || index > size) {
			return null;
		}
		Node node = head;
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		//保留下一个元素
		Object o = node.next.data;
		//删除元素
		node.next = node.next.next;
		//个数-1
		size--;
		return o;
	}
	/**
	 * 删除第一个指定元素(obj)
	 */
	public void remove(Object obj) {
		Node node = head;
		int i = -1;
		while(node.next != null) {
			i++;//下标前进一位
			node = node.next;
			//判断当前元素是否是要删除的元素
			if(node.data.equals(obj)) {
				//使用下标删除这个位置上的元素
				remove(i);
				size--;
				break;
			}
		}
	}
	/**
	 * 替换指定位置上的元素，替换成obj，并且返回被替换的元素
	 */
	public Object set(int index,Object obj) {
		if(index < 0 || index > size) {
			return null;
		}
		Node node = head;
		for(int i = 0; i < index; i++) {
			node = node.next;
		}
		//创建新的节点
		Node newNode = new Node();
		newNode.data = obj;
		//插入
		Object o = node.next.data;
		newNode.next = node.next;
		node.next = newNode;
		return o;
		
	}
	/**
	 * 判断集合中是否存在指定元素obj
	 */
	public boolean contain(Object obj) {
		Node node = head;
		while(node.next != null) {
			node = node.next;
			if(node.data.equals(obj)) {
				return true;
			}
		}
		return false;
	}
	/**
	 * 判断集合是否为空：没有有效元素是空
	 */
	public boolean isEmpty() {
		return size==0;
	}
	
	
	/**
	 * 打印出现在集合中的有效元素
	 */
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		Node node = head;
		while(node.next != null) {
			node = node.next;
			sb.append(node.data + ", ");
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append("]");
		return sb.toString();
	}
	

}
