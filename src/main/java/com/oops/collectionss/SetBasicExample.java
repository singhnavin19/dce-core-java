package com.oops.collectionss;

import java.util.HashSet;
import java.util.Objects;

class IntSet{
	int no;
	public IntSet(int i) {
		this.no=i;
	}
	@Override
	public String toString() {
		return "IntSet [no=" + no + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(no);
	}
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		IntSet other = (IntSet) obj;
//		return no == other.no;
//	}
	
	
}
public class SetBasicExample {

	public static void main(String[] args) {
//		HashSet<Integer> nos=new HashSet<>();
//		nos.add(10);
//		nos.add(20);
//		nos.add(2);
//		nos.add(null);
//		nos.add(20);
		
//		System.out.println(nos);
		
		IntSet i=new IntSet(10);
		IntSet i1=new IntSet(10);
		System.out.println(i.hashCode());
		System.out.println(i1.hashCode());
		
		
		HashSet<IntSet> intSets=new HashSet<>();
		intSets.add(i);
		intSets.add(i1);
		
		System.out.println(intSets);
		
		

	}

}
