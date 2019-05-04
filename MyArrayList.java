package day0504;

import java.util.Arrays;

/**
 * 顺序结构手动实现集合
 * @author dsy
 * 底层就是数组
 * 集合：为了后续开发使用  MyArrayListTest
 */
public class MyArrayList {
	//用来存储数据的数组 - 并且初始长度是10
	private Object[] arr = new Object[10];
	private int size = 0; //表示下标，有效元素个数
	
	/**
	 * 向集合(this)中添加元素
	 * 向arr中添加元素
	 */
	public void add(Object obj) {
		add(size, obj);
	}
	
	/**
	 * 向集合index的位置中插入obj元素
	 */
	public void add(int index, Object obj) {
		//index 非法
		if(index > size || index < 0) {
			return;
		}
		//扩容的条件 - 数组满了
		if(index == arr.length) {
			arr = Arrays.copyOf(arr, arr.length * 2);
		}
		//将index后面的所有元素后移一位
		for(int i = size-1; i >= index; i--) {
			arr[i+1] = arr[i];
		}
		//在index位置上插入元素
		arr[index] = obj;
		size++;
	}
	/**
	 * 获得集合的元素个数
	 */
	public int size() {
		return size;
	}
	/**
	 * 从集合中获得指定位置(index)的元素
	 */
	public Object get(int index) {
		//判断index是否合法
		if(index < 0 || index >= size) {
			return "index非法";
		}
		return arr[index];
	}
	/**
	 * 删除指定位置(index)上的元素，并且返回删除元素
	 */
	public Object remove(int index) {
		//判断index是否合法 0~size-1
		if(index < 0 || index > size-1) {
			return null;
		}
		//保留被删除的元素
		Object temp = arr[index];
		//从删除元素开始将后续元素前移一位
		for(int i = index+1; i < size; i++) {
			arr[i-1] = arr[i];
		}
		size--;
		return temp;//返回被删除的元素
	}
	/**
	 * 删除第一个指定元素(obj)
	 */
	public void remove(Object obj) {
		for(int i = 0; i < size; i++) {
			if(arr[i].equals(obj)) {
				//删除i的位置元素
				remove(i);
				break;//跳出循环
			}
		}
	}
	/**
	 * 替换指定位置上的元素，替换成obj，并且返回被替换的元素
	 */
	public Object set(int index,Object obj) {
		//判断index是否合法 0~size-1
		if(index < 0 || index > size-1) {
			return null;
		}
		//保留被替换的元素
		Object temp = arr[index];
		arr[index] = obj;
		return temp;	
	}
	/**
	 * 打印出现在集合中的有效元素
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i <size; i++) {
			if(arr[i] != null) {
				sb.append(arr[i] + ", ");
			}
		}
		sb.delete(sb.length()-2, sb.length());
		sb.append("]");
		return sb.toString();
	}
	/**
	 * 判断集合中是否存在指定元素obj
	 */
	public boolean contain(Object obj) {
		for(int i = 0; i < size; i++) {
			if(arr[i].equals(obj)) {
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
	
}
