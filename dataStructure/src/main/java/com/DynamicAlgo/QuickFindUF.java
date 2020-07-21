package com.DynamicAlgo;

public class QuickFindUF {
	
	public static  int[] id;
	public QuickFindUF(int n) {
		id = new int[n];
		for(int i = 0 ;i<n;i++) {
			id[i]= i;
		}
		
	}
	public static void main(String[] args) {
		QuickFindUF uf = new QuickFindUF(5);
		System.out.println(uf.isConnected(1, 0));
		uf.union(1, 3);
		uf.union(1, 2);
		uf.union(0, 2);
		for(int j : id) {
			System.out.println(j);
		}
	}
	
	public boolean isConnected(int p, int q) {
		return id[p] == id[q];
	}
	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		System.out.println("PID: "+pid +" And QID: "+qid);
		for(int i = 0 ;i<id.length;i++) {
			if(id[i] == pid) {
				id[i] = qid;
			}
		}
	}
	

}
