class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            List<Integer> q = new ArrayList<>();
            arr.add(q);
        }

        for(int i = 0 ; i < edges.length ; i++){
            arr.get(edges[i][0]).add(edges[i][1]);
            arr.get(edges[i][1]).add(edges[i][0]);
        }

        boolean[] vis = new boolean[n];
        Queue<Integer> queue = new ArrayDeque<>();
        vis[source] = true;
        queue.offer(source);
        while(queue.size() != 0){
            int curr = queue.poll();
            if( curr == destination ) return true;

            for(int x : arr.get(curr)){
                if(!vis[x]){
                    vis[x] = true;
                    queue.offer(x);
                }
            }
        }
        return false;
    }
}