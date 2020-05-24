package com.vinay.unionfind;

public class QuickUnion {

    private int[] id;

    public QuickUnion(int N) {
        id = new int[N];
        for (int i=0;i<N;i++)
            id[i] = i;
    }

    public int root(int i) {
        while (id[i] != i)
            i = id[i];
        return i;
    }

    public boolean isConnected(int p, int q) {
        return root(p) == root(q);
    }

    public void union(int p, int q) {
        int pid = root(p);
        int qid = root(q);
        id[pid] = qid;
    }


}
